import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N == 1) {
            System.out.println("1");
            sc.close();
            return;
        }

        int max2 = 1;

        while (max2 < N) {
            max2 *= 2;
        }
        max2 /= 2;

        int count = 1;
        while (max2 <= N) {
            max2 *= count;
            count++;
        }
        max2 /= --count;

        System.out.println(max2);
        sc.close();
    }
}