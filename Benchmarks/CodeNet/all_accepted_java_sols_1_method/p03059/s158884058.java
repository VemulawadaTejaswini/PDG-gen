import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int ans = 0;

        for(int i=1; A*i<=T; i++){
            ans += B;
        }
        System.out.println(ans);
    }
}