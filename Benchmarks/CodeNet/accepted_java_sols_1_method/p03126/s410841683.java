import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int f[] = new int[M];
        for(int i=0; i<N; i++) {
            int count = sc.nextInt();
            for(int k=0; k<count; k++) {
                int t = sc.nextInt();
                f[t-1]++;
            }
        }
        int result = 0;
        for(int t=0; t<M; t++) {
            if(f[t]==N) result++;
        }
        System.out.println(result);
    }
}
