import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt()-1;
        int Y = sc.nextInt()-1;

        int[] ans = new int[N-1];
        for (int i=0;i<N;i++) {
            for (int j=i+1;j<N;j++) {
                int min = j-i;
                min = Math.min(min, Math.abs(X-i)+Math.abs(Y-j)+1);
                min = Math.min(min, Math.abs(Y-i)+Math.abs(X-j)+1);
                ans[min-1]++;
            }
        }
        for (int i=0;i<N-1;i++) {
            System.out.println(ans[i]);
        }
    }
}