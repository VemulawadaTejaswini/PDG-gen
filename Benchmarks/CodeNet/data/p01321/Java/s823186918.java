import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            int max = 0;
            int min = Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                int sum = 0;
                for(int j=0; j<5; j++) sum += sc.nextInt();
                max = Math.max(max, sum);
                min = Math.min(min, sum);
            }

            System.out.println(max+" "+min);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}