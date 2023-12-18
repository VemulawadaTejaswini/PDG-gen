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

        String S = sc.next();
        for (int i = 0; i < S.length(); i++) {
            int[] temp = new int[6];
            char order = S.charAt(i);
            if (order == 'N') {
                dice.toNorth();
            } else if (order == 'S') {
                dice.toSouth();
            } else if (order == 'E') {
                dice.toEast();
            } else {
                dice.toWest();
            }
        }
        out.printf("%d\n", dice.getTop());
        out.flush();
    }
}

class Dice {
    private static int top;
    private static int south;
    private static int east;
    private static int west;
    private static int north;
    private static int down;
    Dice(int in_top, int in_south, int in_east, int in_west, int in_north, int in_down) {
        top = in_top;
        south = in_south;
        east = in_east;
        west = in_west;
        north = in_north;
        down = in_down;
    }
    public static void toNorth() {
        int temp = top;
        top = south;
        south = down;
        down = north;
        north = temp;
    }
    public static void toSouth() {
        int temp = top;
        top = north;
        north = down;
        down = south;
        south = temp;
    }
    public static void toEast() {
        int temp = top;
        top = west;
        west = down;
        down = east;
        east = temp;
    }
    public static void toWest() {
        int temp = top;
        top = east;
        east = down;
        down = west;
        west = temp;
    }
    public static int getTop() {
        return top;
    }
}
