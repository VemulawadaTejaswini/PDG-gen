import java.util.*;

enum Pause {
    MAMORU,
    TAMERU,
    KOUGEKIDA;
}

class Player {
    private String name;
    private List<Pause> pause;
    private int attackPoint;
    final static int MAX_ATTACK_POINT = 5;

    public Player(String name) {
        this.name = name;
        this.pause = new ArrayList<Pause>();
        this.attackPoint = 0;
    }

    public void registPause(String pause) {
        if (pause.equals("mamoru")) {
            this.pause.add(Pause.MAMORU);
        } else if (pause.equals("tameru")) {
            this.pause.add(Pause.TAMERU);
        } else if (pause.equals("kougekida")) {
            this.pause.add(Pause.KOUGEKIDA);
        }
    }
    public String getName() {
        return this.name;
    }

    public Pause showPause(int time) {
        return this.pause.get(time);
    }

    public void setAttackPoint(int point) {
        if (point <= MAX_ATTACK_POINT) {
            this.attackPoint = point;
        }
    }

    public int getAttackPoint() {
        return this.attackPoint;
    }
}

class Judge {
    private Player judgeMatch(Player player1, Player player2, int time) {
        Player player = null;

        Pause pause1 = player1.showPause(time);
        Pause pause2 = player2.showPause(time);

        int point1 = player1.getAttackPoint();
        int point2 = player2.getAttackPoint();

        if (pause1 == Pause.KOUGEKIDA && point1 == 0) {
            if (!(pause2 == Pause.KOUGEKIDA && point2 == 0)) {
                return player2;
            }
        }
        if (pause2 == Pause.KOUGEKIDA && point2 == 0) {
            if (!(pause1 == Pause.KOUGEKIDA && point1 == 0)) {
                return player1;
            }
        }

        if (pause1 == Pause.KOUGEKIDA && pause2 == Pause.KOUGEKIDA) {
            if (point1 > point2) return player1;
            else if (point2 > point1) return player2;
            point1 = 0;
            player1.setAttackPoint(point1);
            point2 = 0;
            player2.setAttackPoint(point2);
        }

        if (pause1 == Pause.TAMERU) {
            if (pause2 == Pause.KOUGEKIDA) return player2;
            if (point1 < Player.MAX_ATTACK_POINT) {
                point1++;
                player1.setAttackPoint(point1);
            }
        }
        if (pause2 == Pause.TAMERU) {
            if (pause1 == Pause.KOUGEKIDA) return player1;
            if (point2 < Player.MAX_ATTACK_POINT) {
                point2++;
                player2.setAttackPoint(point2);
            }
        }

        if (pause1 == Pause.MAMORU) {
            if (pause2 == Pause.KOUGEKIDA &&
                point2 == Player.MAX_ATTACK_POINT) {
                return player2;
            } else if (pause2 == Pause.KOUGEKIDA &&
                       point2 < Player.MAX_ATTACK_POINT) {
                point2 = 0;
                player2.setAttackPoint(point2);
            }
        }
        if (pause2 == Pause.MAMORU) {
            if (pause1 == Pause.KOUGEKIDA &&
                point1 == Player.MAX_ATTACK_POINT) {
                return player1;
            } else if (pause1 == Pause.KOUGEKIDA &&
                       point1 < Player.MAX_ATTACK_POINT) {
                point1 = 0;
                player1.setAttackPoint(point1);
            }
        }
        return player;
    }

    public Judge() {

    }

    public Player judgePlayer(Player player1, Player player2, int timeOfMatch) {
        Player player = null;

        for (int i = 0; i < timeOfMatch; i++) {
            player = judgeMatch(player1, player2, i);
            if (player != null) {
                return player;
            }
        }
        return player;
    }
}

public class Main {

    public static void main(String[] args) {
        Judge judge = new Judge();
        Player Isono = new Player("Isono-kun");
        Player Nakajima = new Player("Nakajima-kun");

        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < K; i++) {
            String I = sc.nextLine();
            Isono.registPause(I);
        }
        for (int i = 0; i < K; i++) {
            String N = sc.nextLine();
            Nakajima.registPause(N);
        }

        Player winner = judge.judgePlayer(Isono, Nakajima, K);
        if (winner == Isono || winner == Nakajima) {
            System.out.println(winner.getName());
        } else {
            System.out.println("Hikiwake-kun");
        }
    }
}

