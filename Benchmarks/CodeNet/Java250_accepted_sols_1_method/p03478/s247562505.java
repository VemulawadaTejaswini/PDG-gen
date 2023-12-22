import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            int one = i % 10;
            int two = (i%100) / 10;
            int thr = (i%1000) / 100;
            int fou = (i%10000) / 1000;
            int five = (i%100000) / 10000;
            int num = one + two + thr + fou + five;

            if (num >= A && num <= B) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
