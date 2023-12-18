import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            long count = 0;
            for (long a = 1; a <= Math.sqrt(i-3); a++) {
                for (long b = 1; b <= Math.sqrt(i-a*a-a-1); b++) {
                    long ans = i - a*a - b*b - a*b;
                    for (int c = (int)Math.sqrt(ans)-1; c < Math.sqrt(ans); c++) {
                        if (ans == c*c + a*c +b*c) {
                            count++;
                        }
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}