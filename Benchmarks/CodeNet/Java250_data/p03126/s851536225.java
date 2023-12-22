import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] fd = new int[m];
        for(int i = 0; i < n; i++){
            int k = sc.nextInt();
            for(int j = 0; j < k; j++){
                int a = sc.nextInt()-1;
                fd[a]++;
            }
        }
        int ans = 0;
        for(int f : fd){
            if(f == n) ans++;
        }
        System.out.println(ans);
    }
}
