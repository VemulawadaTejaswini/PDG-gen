import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        int m = (int)Math.pow(100, D);
        int counter = 0;
        int res = 0;
        while (counter != N) {
            res += m;
            if (res % (m * 100) == 0) {
                continue;
            }
            counter++;
        }
        System.out.println(res);
        sc.close();
    }
}