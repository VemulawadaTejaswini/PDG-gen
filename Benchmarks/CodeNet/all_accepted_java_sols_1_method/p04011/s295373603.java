import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = 0;
        if (k >= n){
            result = x * n;
        }
        if (k < n) {
            result = x * k + y * (n - k);
        }

        System.out.println(result);
    }
}
