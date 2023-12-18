import java.util.*;

class Player {
    private int score;

    public Player() {
        this.score = 0;
    }

    public void resetScore() {
        this.score = 0;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public int getScore() {
        return this.score;
    }
}

class Rule {
    public Rule() {
    }

    public void playGame(Player player1, int cardOfPlayer1,
                    Player player2, int cardOfPlayer2) {
        if (cardOfPlayer1 > cardOfPlayer2) {
            player1.setScore(cardOfPlayer1 + cardOfPlayer2);
        } else if (cardOfPlayer1 < cardOfPlayer2) {
            player2.setScore(cardOfPlayer1 + cardOfPlayer2);
        } else {
            player1.setScore(cardOfPlayer1);
            player2.setScore(cardOfPlayer2);
        }
    }
}

public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rule rule = new Rule();
        Player player1 = new Player();
        Player player2 = new Player();

        while (true) {
            int n = Integer.parseInt(sc.next());
            if (n == 0) break;

            player1.resetScore();
            player2.resetScore();
            
            for (int i = 0; i < n; i++)  {
                int cardOfPlayer1 = Integer.parseInt(sc.next());
                int cardOfPlayer2 = Integer.parseInt(sc.next());
                rule.playGame(player1, cardOfPlayer1, player2, cardOfPlayer2);
            }

            System.out.println(player1.getScore() + " " + player2.getScore());
        }
    }
}

