import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
           long x = sc.nextInt();
           long y = sc.nextInt();
           double z = Math.sqrt(x*x + y*y);
           if (z <= d) count++;
        }
        System.out.println(count);
    }
}
