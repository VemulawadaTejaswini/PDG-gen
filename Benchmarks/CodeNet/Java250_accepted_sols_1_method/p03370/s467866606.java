import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<N;i++){
            int m = sc.nextInt();
            min = Math.min(min,m);
            sum += m;
        }
        int ans = N+(X-sum)/min;
        System.out.print(ans);
    }
}


