import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = 0;
        if(K>=N){
            ans=N*X;
        }else{
            ans=K*X+(N-K)*Y;
        }
        System.out.println(ans);
    }
}