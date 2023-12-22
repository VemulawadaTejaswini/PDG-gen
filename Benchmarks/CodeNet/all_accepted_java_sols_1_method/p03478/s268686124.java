import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int answer = 0;

        boolean add_flg = true;
        int sum = 0;
        int target = 0;
        for (int i = A; i <= N; i++) {
            sum = 0;
            add_flg = true;
            target = i;

            while (target > 0) {
                sum += target % 10;
                target /= 10;
                if (sum > B) {
                    add_flg = false;
                    break;
                }
            }
            if (add_flg && sum >= A) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}