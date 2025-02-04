import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        long num[] = new long[N];
        long ans = 1, limit = 1000000000000000000L;
		for(int i = 0; i < N; i++){
			num[i] = scan.nextLong();
		}

		Arrays.sort(num);
		for(Long tmp: num) {
			if(tmp == 0) {
				ans = 0;
				break;
			}else if(tmp <= (limit / ans)){
				ans *= tmp;
			}else {
				ans = -1;
				break;
			}
		}

		System.out.println(ans);
	}
}
