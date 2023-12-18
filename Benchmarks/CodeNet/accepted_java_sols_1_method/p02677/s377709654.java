import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayDeque;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

        double tan = 360.0 * H / 12 + 0.5 * M;
        double tyo = 360.0 * M / 60;
        double c = Math.abs(tan - tyo);
        if(c>180){
            c = 360 - c;
        }
        double C = A * A + B * B - 2 * A * B * Math.cos(Math.toRadians(c));
        System.out.println(Math.sqrt(C));
    }
}