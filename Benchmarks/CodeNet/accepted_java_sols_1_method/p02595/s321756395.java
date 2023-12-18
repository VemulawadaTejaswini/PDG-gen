import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); long D = scan.nextInt();

        int ans = 0;
        for(int i = 0; i < N; i++) {
            long X = scan.nextInt();
            long Y = scan.nextInt();
            if(X*X+Y*Y <= D*D) ans++;
        }

        System.out.println(ans);
    }
}