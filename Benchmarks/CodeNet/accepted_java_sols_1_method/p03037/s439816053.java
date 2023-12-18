import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l,r;
        int maxL = 0;
        int minR = Integer.MAX_VALUE;
        for (int i = 0; i< m;i++) {
            l = sc.nextInt();
            r = sc.nextInt();
            maxL = Math.max(maxL, l);
            minR = Math.min(minR, r);
        }
        
        if (minR < maxL) {
            System.out.println(0);
        } else {
            System.out.println(minR - maxL + 1);
        }
    }
}