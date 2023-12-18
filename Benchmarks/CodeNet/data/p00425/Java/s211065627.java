import java.util.*;

enum Eye {
    TOP,
    FRONT,
    RIGHT,
    LEFT,
    BACK,
    BOTTOM
}

class Dice {
    private int[] eye = { 1, 2, 3, 4, 5, 6 };
    private int topCount;

    public Dice() {
        this.topCount = 1;
    }

    public void clearDice() {
        for (int i = 0; i < 6; i++) {
            this.eye[i] = i + 1;
        }
        this.topCount = 1;
    }

    public void rollNorth() {
        rollN();
        addTopCount();
    }

    public void rollSouth() {
        rollS();
        addTopCount();
    }

    public void rollEast() {
        rollE();
        addTopCount();
    }

    public void rollWest() {
        rollW();
        addTopCount();
    }

    public void rollRight() {
        rollR();
        addTopCount();
    }

    public void rollLeft() {
        rollL();
        addTopCount();
    }

    public int getTopCount() {
        return this.topCount;
    }

    private void rollN() {
        int tmp;

        tmp = this.eye[Eye.TOP.ordinal()];
        this.eye[Eye.TOP.ordinal()] = this.eye[Eye.FRONT.ordinal()];
        this.eye[Eye.FRONT.ordinal()] = this.eye[Eye.BOTTOM.ordinal()];
        this.eye[Eye.BOTTOM.ordinal()] = this.eye[Eye.BACK.ordinal()];
        this.eye[Eye.BACK.ordinal()] = tmp;
    }

    private void rollS() {
        int tmp;

        tmp = this.eye[Eye.TOP.ordinal()];
        this.eye[Eye.TOP.ordinal()] = this.eye[Eye.BACK.ordinal()];
        this.eye[Eye.BACK.ordinal()] = this.eye[Eye.BOTTOM.ordinal()];
        this.eye[Eye.BOTTOM.ordinal()] = this.eye[Eye.FRONT.ordinal()];
        this.eye[Eye.FRONT.ordinal()] = tmp;
    }

    private void rollE() {
        int tmp;

        tmp = this.eye[Eye.TOP.ordinal()];
        this.eye[Eye.TOP.ordinal()] = this.eye[Eye.LEFT.ordinal()];
        this.eye[Eye.LEFT.ordinal()] = this.eye[Eye.BOTTOM.ordinal()];
        this.eye[Eye.BOTTOM.ordinal()] = this.eye[Eye.RIGHT.ordinal()];
        this.eye[Eye.RIGHT.ordinal()] = tmp;
    }

    private void rollW() {
        int tmp;

        tmp = this.eye[Eye.TOP.ordinal()];
        this.eye[Eye.TOP.ordinal()] = this.eye[Eye.RIGHT.ordinal()];
        this.eye[Eye.RIGHT.ordinal()] = this.eye[Eye.BOTTOM.ordinal()];
        this.eye[Eye.BOTTOM.ordinal()] = this.eye[Eye.LEFT.ordinal()];
        this.eye[Eye.LEFT.ordinal()] = tmp;
    }

    private void rollR() {
        int tmp;

        tmp = this.eye[Eye.FRONT.ordinal()];
        this.eye[Eye.FRONT.ordinal()] = this.eye[Eye.RIGHT.ordinal()];
        this.eye[Eye.RIGHT.ordinal()] = this.eye[Eye.BACK.ordinal()];
        this.eye[Eye.BACK.ordinal()] = this.eye[Eye.LEFT.ordinal()];
        this.eye[Eye.LEFT.ordinal()] = tmp;
    }

    private void rollL() {
        int tmp;

        tmp = this.eye[Eye.FRONT.ordinal()];
        this.eye[Eye.FRONT.ordinal()] = this.eye[Eye.LEFT.ordinal()];
        this.eye[Eye.LEFT.ordinal()] = this.eye[Eye.BACK.ordinal()];
        this.eye[Eye.BACK.ordinal()] = this.eye[Eye.RIGHT.ordinal()];
        this.eye[Eye.RIGHT.ordinal()] = tmp;
    }

    private void addTopCount() {
        this.topCount += this.eye[Eye.TOP.ordinal()];
    }
}

class Player {
    private Dice dice;

    public Player() {
        dice = new Dice();
    }

    public void start() {
        dice.clearDice();
    }

    public void setDirection(String direction) {
        rollDice(direction);
    }

    void rollDice(String direction) {
        if (direction.equals("North")) {
            dice.rollNorth();
        } else if (direction.equals("South")) {
            dice.rollSouth();
        } else if (direction.equals(("East"))) {
            dice.rollEast();
        } else if (direction.equals(("West"))) {
            dice.rollWest();
        } else if (direction.equals(("Right"))) {
            dice.rollRight();
        } else if (direction.equals(("Left"))) {
            dice.rollLeft();
        }
    }

    int getCount() {
        return dice.getTopCount();
    }
}

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Player player = new Player();
        Scanner sc = new Scanner(System.in);

        while (true) {
            player.start();
            int a = 0;
            int n = Integer.parseInt(sc.next());
            if (n == 0) {
                break;
            }
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                player.setDirection(str);
            }
            System.out.println(player.getCount());
        }
    }
}

