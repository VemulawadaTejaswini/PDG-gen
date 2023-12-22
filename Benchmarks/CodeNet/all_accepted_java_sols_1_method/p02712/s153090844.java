import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var n = sc.nextInt();

        var sum = 0l;
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        sc.close();
    }
}
