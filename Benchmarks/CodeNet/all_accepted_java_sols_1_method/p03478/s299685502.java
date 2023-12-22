import java.util.*;
 
public class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = 0;
            int tmp1 = i;
            while (tmp1 > 0) {
                tmp += tmp1%10;
                tmp1 /= 10;
            }
            if (a <= tmp && tmp <= b) sum+=i;
        }
 
        System.out.println(sum);
    }
}