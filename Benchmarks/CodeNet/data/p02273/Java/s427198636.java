import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(0.0 + " " + 0.0);
        koch(n, new Pair(0,0), new Pair(100, 0));
        System.out.println(100.0 + " " + 0.0);
    }
    
    public static void koch(int i, Pair p1, Pair p2) {
        if (i == 0) return;
        Pair s = new Pair((p1.x * 2 + p2.x) / 3,(p1.y * 2 + p2.y) / 3);
        Pair t = new Pair((p1.x + p2.x * 2) / 3,(p1.y + p2.y * 2) / 3);
        double ux = (t.x - s.x)*Math.cos(Math.toRadians(60)) - (t.y - s.y)*Math.sin(Math.toRadians(60)) + s.x;
        double uy = (t.x - s.x)*Math.sin(Math.toRadians(60)) + (t.y - s.y)*Math.cos(Math.toRadians(60)) + s.y;
        Pair u = new Pair(ux, uy);
        
        koch(i - 1, p1, s);
        System.out.println(s.x + " " + s.y);
        koch(i - 1, s, u);
        System.out.println(u.x + " " + u.y);
        koch(i - 1, u, t);
        System.out.println(t.x + " " + t.y);
        koch(i - 1, t, p2);
    }
}

class Pair {
    double x;
    double y;
    public Pair(double x, double y) {
        this.x = x;
        this.y = y;
    }
}