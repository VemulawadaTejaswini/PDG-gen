import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] P = new int[n];
        int c = 0;
        Arrays.setAll(P	, i -> sc.nextInt());
        for(int i = 1; i < n-1; i++) {
            if(Math.min(P[i-1], P[i+1]) < P[i] &&  P[i] < Math.max(P[i-1], P[i+1])) c++;
        }
        System.out.println(c);
    }
}
