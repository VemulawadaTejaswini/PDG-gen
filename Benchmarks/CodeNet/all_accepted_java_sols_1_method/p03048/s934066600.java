import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0 ; i <= 3000 ; i++) {
            for (int j = 0 ; j <= 3000; j++) {
                int k = n - r * i - g * j;
                if (k >= 0 && k % b == 0) count++;
            }
        }

        System.out.println(count);

    }

}
