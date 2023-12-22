import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[M+1];
        for(int i=1;i<=M;i++) A[i]=sc.nextInt();
        int pos = 0;
        while(X>A[pos]) pos++;
        int ans = Math.min(pos-1,M-(pos-1));
        System.out.println(ans);
    }
}