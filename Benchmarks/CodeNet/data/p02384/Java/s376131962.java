import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dice dice = new Dice(sc.nextInt(),
                             sc.nextInt(),
                             sc.nextInt(),
                             sc.nextInt(),
                             sc.nextInt(),
                             sc.nextInt());

        int q = sc.nextInt();
        while (q-- > 0) {
            int top = sc.nextInt();
            int south = sc.nextInt();
            System.out.println(eastFace(dice, top, south));
         }
    }
    private static int eastFace(Dice d, int top, int south) {
        int i = 0;
        int m = 6;
        while (m-- > 0) {
            if (d.getTop() == top) {
                int n = 4;
                while (n-- > 0) {
                    if (d.getSouth() == south)
                        return d.getEast();
                    d = roll(d, "NES");
                }
                assert false; // invalid input
            }
            assert i < 6;
            d = roll(d, "NNWNN".charAt(i++));
        }
        assert false;
        return -1;
    }
    private static Dice roll(Dice d, String directions) {
        for (int i = 0; i < directions.length(); i++)
            d = roll(d, directions.charAt(i));
        return d;
    }
    private static Dice roll(Dice d, int direction) {
        switch (direction) {
        case 'N': return d.rollToN();
        case 'S': return d.rollToS();
        case 'W': return d.rollToW();
        case 'E': return d.rollToE();
        }
        assert false;
        return null;
    }

    private static class Dice {
        private int t;
        private int s;
        private int e;
        private int w;
        private int n;
        private int b;

        public Dice() {
            this(1, 2, 3, 4, 5, 6);
        }
        public Dice(int t, int s, int e, int w, int n, int b) {
            this.t = t;
            this.s = s;
            this.e = e;
            this.w = w;
            this.n = n;
            this.b = b;
        }
        public Dice rollToN() {
            return new Dice(s, b, e, w, t, n);
        }
        public Dice rollToS() {
            return new Dice(n, t, e, w, b, s);
        }
        public Dice rollToW() {
            return new Dice(e, s, b, t, n, w);
        }
        public Dice rollToE() {
            return new Dice(w, s, t, b, n, e);
        }
        public int getTop() {
            return t;
        }
        public int getSouth() {
            return s;
        }
        public int getEast() {
            return e;
        }
    }
}

