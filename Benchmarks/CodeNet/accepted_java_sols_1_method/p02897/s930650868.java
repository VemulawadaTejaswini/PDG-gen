import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextInt();
        if (N==0) {
            System.out.println(0);
        }
        else if (N % 2 == 0) {
            System.out.println(0.5);
        }
        else {
            System.out.println(((N/2)+0.5)/N);
        }
    }
}