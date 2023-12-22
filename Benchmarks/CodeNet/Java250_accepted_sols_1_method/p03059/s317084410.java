import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int T = scan.nextInt();
        int result = b * (int) ((T + 0.5) / a);
        System.out.println("" + result);
    }

}
