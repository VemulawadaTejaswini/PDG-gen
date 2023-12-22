import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        int max = b / k;

        if (k * max >= a) {
            System.out.println("OK");
          	return;
        }

        System.out.println("NG");
    }
}
