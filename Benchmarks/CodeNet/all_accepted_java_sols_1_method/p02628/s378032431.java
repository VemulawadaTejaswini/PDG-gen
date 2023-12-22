import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] p = new int[N];
        for(int i=0;i<N; i++){
            p[i] = sc.nextInt();
        }
        sc.close();;
        Arrays.sort(p);
        int ans = 0;
        for(int i=0; i<K; i++){
            ans = ans + p[i];
        }
        System.out.println(ans);
    }
}
