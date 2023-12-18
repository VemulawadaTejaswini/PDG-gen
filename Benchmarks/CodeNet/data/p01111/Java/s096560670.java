import java.util.*;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true) {
            int n = sc.nextInt() * 2;
            if (n == 0) {
                break;
            }
            int max = 0;
            int maxNum = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    int x = n / i + 1 - i;
                    if (x > 0 && x % 2 == 0) {
                        max = i;
                        maxNum = x / 2;
                    }
                }
            }
            sb.append(maxNum).append(" ").append(max).append("\n");
        }
        System.out.print(sb);
    }
}
