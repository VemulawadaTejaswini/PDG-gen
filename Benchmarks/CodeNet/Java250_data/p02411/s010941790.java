import java.util.*;

public class Main {
    public static final int MAX = 100;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true) {
            int m = scn.nextInt(), f = scn.nextInt(), r = scn.nextInt();
            if(m < 0 && f < 0 && r < 0) {
                break;
            } else if(m < 0 || f < 0) {
                System.out.println("F");
            } else if(m + f > 79) {
                System.out.println("A");
            } else if(m + f > 64) {
                System.out.println("B");
            } else if(m + f > 49) {
                System.out.println("C");
            } else if(m + f > 29) {
                System.out.println(r > 49 ? "C" : "D");
            } else {
                System.out.println("F");
            }
        }
    }
}