import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        int t = sc.nextInt();
        double s = sc.nextDouble();
        if (d / s <= t) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
