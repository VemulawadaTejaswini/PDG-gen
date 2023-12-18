import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int w = 0;
        int h = 0;
        int y = 0;
        int x = 0;
        while((w = scn.nextInt()) > 0 | (h = scn.nextInt()) > 0) {
            boolean[][] fld = new boolean[h][w];
            for(int i = 0; i < h; i++) {
                char[] ary = scn.next().toCharArray();
                for(int j = 0; j < w; j++) {
                    switch(ary[j]) {
                      case '@':
                        y = i;
                        x = j;
                      case '.':
                        fld[i][j] = true;
                        break;
                      case '#':
                        fld[i][j] = false;
                        break;
                      default:
                        assert false;
                    }
                }
            }
            Counter counter = new Counter(fld, y, x);
            counter.start();
            try {
                counter.join();
            } catch(InterruptedException ignore) {}
            System.out.println(counter.getSum());
        }
    }
}

class Counter extends Thread {
    private int y;
    private int x;
    private static int sum;
    private static boolean[][] fld;

    public Counter(boolean[][] fld, int y, int x) {
        this(y, x);
        this.sum = 0;
        this.fld = fld;
    }

    private Counter(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public synchronized void run() {
        try {
            if(fld[y][x]) {
                sum++;
                fld[y][x] = false;
                Counter top = new Counter(-~y, x);
                Counter left = new Counter(y, ~-x);
                Counter right = new Counter(y, -~x);
                Counter bottom = new Counter(~-y, x);
                top.start();
                left.start();
                right.start();
                bottom.start();
                try {
                    top.join();
                    left.join();
                    right.join();
                    bottom.join();
                } catch(InterruptedException ignore) {}
            }
        } catch(ArrayIndexOutOfBoundsException ignore) {}
    }
}