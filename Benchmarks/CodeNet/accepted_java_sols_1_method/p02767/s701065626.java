import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x = new int[n];
        for (int i = 0 ; i < n ; i++) {
            x[i] = sc.nextInt();
        }
        int min = 1000000000;

        for (int i = 0 ; i <= 100 ; i++) {
            int sum = 0;
            for (int j = 0 ; j < n ; j++) {
                sum += (x[j] - i) * (x[j] - i);
            }
            min = Math.min(min, sum);
        }

        System.out.println(min);
    }

}
