import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans1 = Math.ceil(n / 1.08);
        if((int)(ans1 * 1.08) == n) {
            System.out.println((int)ans1);
        } else {
            System.out.println(":(");
        }
    }
}