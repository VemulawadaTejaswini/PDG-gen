import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] p = new int[100002];

        for(int i = 0 ; i < p.length; i++){
            p[i] = 0;
        }

        for(int i = 0; i < n; i++){
            int d = sc.nextInt();
            p[d + 1]++;
        }

        int ans = 0;
        int sum = 0;
        for(int i = 0; i < p.length; i++){
            if(sum + p[i] == n / 2){
                ans++;
            }
            sum += p[i];
        }


        System.out.println(ans);

        return;
    }
}
