import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        long ans = 0;
        if(A+B > C*2){
            int c = Math.min(X, Y);
            ans += C * 2 * c;
            X -= c;
            Y -= c;
        }
        if(X > 0){
            if(A > C*2) ans += C * 2 * X;
            else ans += A * X;
        }
        if(Y > 0){
            if(B > C*2) ans += C * 2 * Y;
            else ans += B * Y;
        }
        System.out.println(ans);
        sc.close();

    }

}
