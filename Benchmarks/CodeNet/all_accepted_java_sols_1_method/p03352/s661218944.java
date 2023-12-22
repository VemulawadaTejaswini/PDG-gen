import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        boolean[] a = new boolean[x+1];
        a[1] = true;
        for(int i = 2; i < x; i++) {
            int t = i * i;
            while(t <= x) {
                a[t] = true;
                t *= i;
            }
        }
        int ans = x;
        while(!a[ans]) ans--;
        System.out.println(ans);
    }
}