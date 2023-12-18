import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        if(A==0) {
            System.out.println(0);
            return;
        }
        double B = sc.nextDouble();
        if(B==0.0) {
            System.out.println(0);
            return;
        }
        long hundB = (long)(100*B);

        System.out.println((A*hundB)/100);
    }
}
