import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        int a[] = new int[6];
        int b[] = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < 6; i++) {
            b[i] = Integer.parseInt(sc.next());
        }
        Dice d1 = new Dice(a);
        Dice d2 = new Dice(b);

        outer:
        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 3; k++) {
                if (d1.getBack() == d2.getBack()) break outer;
                d2.rollSouth();
            }
            d2.rollEast();
        }
        for (int m = 0; m < 3; m++) {
            if (d1.getTop() == d2.getTop()) break;
            d2.rollEast();
        }
        out.println(d1.getRight() == d2.getRight() ? "Yes" : "No");

        out.flush();
    }
}
class Dice {
    private int top, front, back, left, right, down, temp;
    Dice(int[] a) {
        this.top = a[0];
        this.front = a[4];
        this.back = a[1];
        this.left = a[3];
        this.right = a[2];
        this.down = a[5];
    }
    void rollWest() {
        this.temp = this.left;
        this.left = this.top;
        this.top = this.right;
        this.right = this.down;
        this.down = this.temp;
    }
    void rollEast() {
        this.temp = this.right;
        this.right = this.top;
        this.top = this.left;
        this.left = this.down;
        this.down = this.temp;
    }
    void rollSouth() {
        this.temp = this.back;
        this.back = this.top;
        this.top = this.front;
        this.front = this.down;
        this.down = this.temp;
    }
    void rollNorth() {
        this.temp = this.front;
        this.front = this.top;
        this.top = this.back;
        this.back = this.down;
        this.down = this.temp;
    }
    int getTop() {
        return this.top;
    }
    int getFront() {
        return this.front;
    }
    int getBack() {
        return this.back;
    }
    int getRight() {
        return this.right;
    }
    int getLeft() {
        return this.left;
    }
}
