import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
 
        int ans = 1;
        int tmp = 0;
        for (int i = 1; i <= N; ++i) {
            int num = i;
            int cnt = 0;
            while (true) {
                if (num % 2 == 0) {
                    cnt++;
                    num /= 2;
                }
                else {
                    break;
                }
            }
            if (cnt > tmp) {
                tmp = cnt;
                ans = i;
            }
        }
 
        System.out.println(ans);
	}
}