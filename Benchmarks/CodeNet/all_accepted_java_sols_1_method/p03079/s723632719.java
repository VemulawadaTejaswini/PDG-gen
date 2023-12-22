import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        sc.close();

        boolean result = false;

        if(A==B && B==C){
            result = true;
        }

        String str = result ? "Yes" : "No";

        System.out.println(str);

    }
}
