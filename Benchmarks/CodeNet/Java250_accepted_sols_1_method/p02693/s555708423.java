import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int tmp = K;
        int times = 1;
        boolean results = false;
        while (tmp <= B) {
            if (tmp <= B && tmp >= A) {
                results = true;
                break;
            }
            times++;
            tmp = times * K;
        }

        if (results) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}
