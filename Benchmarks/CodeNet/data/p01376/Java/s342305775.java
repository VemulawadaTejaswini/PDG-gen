import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int max = 0;
        for(int i=0; i<m; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += sc.nextInt();
            }
            max = Math.max(max,sum);
        }

        System.out.println(max);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}