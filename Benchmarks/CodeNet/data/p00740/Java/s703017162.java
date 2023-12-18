import java.util.*;

class Game {
    private Pebble pebble;
    private Candidate[] candidate;
    private int numOfCandidates;
    private int totalNumOfPebbles;

    public Game(int numOfCandidates, int totalNumOfPebbles) {
        candidate = new Candidate[numOfCandidates];
        for (int i = 0; i < numOfCandidates; i++) {
            candidate[i] = new Candidate();
        }
        pebble = new Pebble(totalNumOfPebbles);

        this.numOfCandidates = numOfCandidates;
        this.totalNumOfPebbles = totalNumOfPebbles;
    }

    public int play() {
        for (int i = 0; i < numOfCandidates; i++) {
            candidate[i].playGame(pebble);
            if (candidate[i].getNumOfPebbles() == totalNumOfPebbles) {
                return i;
            }
        }
        return -1;
    }
}

class Pebble {
    private int numOfPebbles;

    public Pebble(int numOfPebbles) {
        this.numOfPebbles = numOfPebbles;
    }

    public void setNumOfPebbles(int numOfPebbles) {
        this.numOfPebbles = numOfPebbles;
    }

    public void decrementPebbles() {
        this.numOfPebbles--;
    }

    public void addPebbles(int numOfPebbles) {
        this.numOfPebbles += numOfPebbles;
    }

    public int getNumOfPebbles() {
        return this.numOfPebbles;
    }
}

class Candidate {
    private int numOfPebbles;

    public Candidate() {
        this.numOfPebbles = 0;
    }

    public void playGame(Pebble pebble) {
        if (pebble.getNumOfPebbles() != 0) {
            this.numOfPebbles++;
            pebble.decrementPebbles();
        } else {
            pebble.addPebbles(this.numOfPebbles);
            this.numOfPebbles = 0;
        }
    }

    public int getNumOfPebbles() {
        return this.numOfPebbles;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n, p;
        while (true) {
            n = Integer.parseInt(sc.next());
            p = Integer.parseInt(sc.next());
            if (n == 0 && p == 0) break;
            Game game = new Game(n, p);
            while (true) {
                int result = game.play();
                if (result != -1) {
                    System.out.println(result);
                    break;
                }
            }
        }
    }
}

