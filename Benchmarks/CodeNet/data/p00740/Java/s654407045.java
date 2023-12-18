import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n, p;
        while((n = scn.nextInt()) > 0) {
            p = scn.nextInt();
            int i = n - 1, now = p;
            int[] ary = new int[n];
            while(ary[i] != p) {
                i = (i + 1) % n;
                if(now > 0) {
                    now--;
                    ary[i]++;
                } else {
                    now += ary[i];
                    ary[i] = 0;
                }
            }
            System.out.println(i);
        }
    }
}