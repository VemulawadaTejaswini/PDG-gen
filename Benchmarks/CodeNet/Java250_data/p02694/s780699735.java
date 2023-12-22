import java.util.Scanner;

public class Main {
    public static void main(final String args[]) {
        Scanner scan = new Scanner(System.in);
        double X = scan.nextDouble();
        double K = 100;
        int i = 0;
        while(X > K){
            K = Math.floor(K * 1.01);
            i++;
        }
        System.out.println(i);

    }
}
