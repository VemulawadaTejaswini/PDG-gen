import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        for(int i=0; i<m; i++){
            x[i] = sc.nextInt();
        }

        if(n >= m){
            System.out.println(0);
            return;
        }

        Arrays.sort(x);

        int[] len = new int[m-1];
        for(int i=0; i<m-1; i++){
            len[i] = x[i+1] - x[i];
        }

        Arrays.sort(len);

        long ans = 0;
        for(int i=0; i<m-n; i++){
            ans += len[i];
        }

        System.out.println(ans);

    }
}