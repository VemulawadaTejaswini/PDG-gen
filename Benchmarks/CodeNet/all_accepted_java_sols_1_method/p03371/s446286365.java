import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A, B, C, X, Y;
        A = in.nextInt(); B = in.nextInt(); C = in.nextInt(); X = in.nextInt(); Y = in.nextInt();
       int sum = 0;
        while( X > 0 && Y > 0) {
            if(C * 2 < (A + B)) {
               sum += 2*C;
            } else {
                sum+= (A+B);
            }
            X--; Y--;
        }
        while(X > 0){
           if(A > (2*C)) sum+=(2*C);
           else sum+=A;

           X--;
        }

        while(Y > 0) {
            if(B > (2*C)) sum+=(2*C);
            else sum+=B;

            Y--;
        }
        System.out.println(sum);
    }
}
