import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Dice d = new Dice(
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt()
        );
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            d.move(s.substring(i, i+1));
        }
        d.showTop();
    }
}

class Dice {
    public int[] ary;
    public Point p;
    public Dice(int a, int b, int c, int d, int e, int f) {
        ary = new int[6];
        ary[0] = a;
        ary[1] = b;
        ary[2] = c;
        ary[3] = d;
        ary[4] = e;
        ary[5] = f;
        p = new Point();
    }
    
    public void move(String s) {
        int t;
        switch(s) {
        case "N":
            t = ary[0];
            ary[0] = ary[1];
            ary[1] = ary[5];
            ary[5] = ary[4];
            ary[4] = t;
            p.y++;
            break;
        case "S":
            t = ary[0];
            ary[0] = ary[4];
            ary[4] = ary[5];
            ary[5] = ary[1];
            ary[1] = t;
            p.y--;
            break;
        case "E":
            t = ary[0];
            ary[0] = ary[3];
            ary[3] = ary[5];
            ary[5] = ary[2];
            ary[2] = t;
            p.x++;
            break;
        case "W":
            t = ary[0];
            ary[0] = ary[2];
            ary[2] = ary[5];
            ary[5] = ary[3];
            ary[3] = t;
            p.x--;
            break;
        }
    }
    public void showTop() {
        System.out.println(ary[0]);
    }
}

class Point {
    public int x;
    public int y;

    public Point() {
        x = 0;
        y = 0;
    }
}