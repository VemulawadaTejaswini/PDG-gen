import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxA = 0;
        int maxB = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(maxA < a) {
                maxA = a;
                maxB = b;
            }
        }
        System.out.println(maxA + maxB);
    }
}
