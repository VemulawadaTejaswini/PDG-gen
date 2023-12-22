import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int sum = 0;
        int eat = 1000;
        for (int i = 0; i < n; i++) {
            sum += l + i;
            if (Math.abs(l + i) < Math.abs(eat)) {
                eat = l + i;
            }
        }
        System.out.println(sum - eat);
    }
}
