import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(sc.next());
        Dice[] dices = new Dice[n];
        for (int i = 0; i < n; i++) {
            // [1-1]:top
            // [2-1]:south
            // [3-1]:east
            // [4-1]:west
            // [5-1]:north
            // [6-1]:down
            int[] a = new int[6];
            for (int j = 0; j < 6; j++) {
                a[j] = Integer.parseInt(sc.next());
            }
            dices[i] = new Dice(a[0], a[1], a[2], a[3], a[4], a[5]);
        }

        boolean equalExist = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dices[i].equals(dices[j])) {
                    equalExist = true;
                    break;
                }
            }
        }
        if (equalExist) {
            out.printf("No\n");
        } else {
            out.printf("Yes\n");
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
    public boolean rotation(int top_val, int south_val) {
        if (top == top_val && south == south_val) {
            return true;
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
            } else {
                return false;
            }
        } else {
            if (east == top_val) {
                this.toWest();
            } else if (west == top_val) {
                this.toEast();
            } else if (down == top_val) {
                this.toWest();
                this.toWest();
            } else {
                return false;
            }
        }
        return rotation(top_val, south_val);
    }
    public boolean equals(Dice dice) {
        if (this.rotation(dice.getTop(), dice.getSouth())) {
            if (this.north == dice.north &&
                this.east == dice.east &&
                this.west == dice.west &&
                this.down == dice.down) {
                return true;
            }
        }
        return false;
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
    public int getSouth() {
        return south;
    }
    public int getEast() {
        return east;
    }
}
