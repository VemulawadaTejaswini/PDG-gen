import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        double W = sc.nextDouble();
        double H = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.print(W*H/2.0);
        System.out.println(" " + ((x==W/2 && y==H/2)? 1:0));
    }
}
