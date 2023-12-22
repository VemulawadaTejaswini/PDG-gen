import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        
        int n = k;
        while (n <= b) {
            if (n >= a) {
                System.out.println("OK");
                return;
            }
            n = n + k;
        }

        System.out.println("NG");
    }
}