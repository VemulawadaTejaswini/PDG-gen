
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int K = in.nextInt();
        long ans = 0;

//        ans  = gcd(1,2);

        for (int i = 1; i <= K; i++) {
            for (int j = 1 ; j <=K; j++) {
                for (int k = 1; k <= K; k++) {
                    ans += gcd(i,j,k);
                }
            }
        }

        out.println(ans);

        in.close();
        out.close();
    }

    public static int gcd(int a, int b, int c){
        return gcd(gcd(a,b),c);
    }

    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
}
