import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int rem = N-K;
        long ans = 0 ;
        if(rem>0)
            ans = K*X + (rem*Y);
        else
            ans = N*X;
        System.out.println(ans);
    }

}
