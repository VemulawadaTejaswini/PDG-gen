import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1 ; i < n ; i++) {
            int x = n - i;
            for (int j = 1 ; j <= Math.sqrt(x) ; j++) {
                if (x % j == 0) {
                    if (x / j == j) {
                        c++;
                    } else {
                        c += 2;
                    }
                }
            }
        }
        System.out.println(c);

    }

}