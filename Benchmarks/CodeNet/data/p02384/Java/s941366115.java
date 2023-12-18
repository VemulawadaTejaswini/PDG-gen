import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        // [1-1]:top
        // [2-1]:south
        // [3-1]:east
        // [4-1]:west
        // [5-1]:north
        // [6-1]:down
        int[] n = new int[6];
        for (int i = 0; i < 6; i++) {
            n[i] = Integer.parseInt(sc.next());
        }
        Dice dice = new Dice(n[0], n[1], n[2], n[3], n[4], n[5]);

        int q = Integer.parseInt(sc.next());
        for (int i = 0; i < q; i++) {
            int top = Integer.parseInt(sc.next());
            int south = Integer.parseInt(sc.next());
            dice.rotation(top, south);
            out.printf("%d\n", dice.getEast());
        }
        out.flush();
    }
}

class Dice {
    private int top;
    private int south;
    private int east;
    private int west;
    private int north;
    private int down;
    Dice(int in_top, int in_south, int in_east, int in_west, int in_north, int in_down) {
        top = in_top;
        south = in_south;
        east = in_east;
        west = in_west;
        north = in_north;
        down = in_down;
    }
    public void rotation(int top_val, int south_val) {
        if (top == top_val && south == south_val) {
            return;
        }
        if (south != south_val) {
            if (top == south_val) {
                this.toSouth();
            } else if (east == south_val) {
                this.toWest();
                this.toSouth();
            } else if (west == south_val) {
                this.toEast();
                this.toSouth();
            } else if (north == south_val) {
                this.toSouth();
                this.toSouth();
            } else if (down == south_val) {
                this.toNorth();
            }
            rotation(top_val, south_val);
        } else {
            if (east == top_val) {
                this.toWest();
            } else if (west == top_val) {
                this.toEast();
            } else {
                this.toWest();
                this.toWest();
            }
        }
    }
    public void toNorth() {
        int temp = top;
        top = south;
        south = down;
        down = north;
        north = temp;
    }
    public void toSouth() {
        int temp = top;
        top = north;
        north = down;
        down = south;
        south = temp;
    }
    public void toEast() {
        int temp = top;
        top = west;
        west = down;
        down = east;
        east = temp;
    }
    public void toWest() {
        int temp = top;
        top = east;
        east = down;
        down = west;
        west = temp;
    }
    public int getTop() {
        return top;
    }
    public int getEast() {
        return east;
    }
}
