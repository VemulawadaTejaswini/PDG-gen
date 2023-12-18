import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k % 2 == 0) {
            System.out.println("-1");
            return;
        }
        int count = 1;
        long s = 7;
        while (count < k) {
            if (s % k == 0) {
                System.out.println(count);
                return;
            }
            s = s * 10 + 7;
            count++;
        }
        System.out.println(count - 1);
    }

}
