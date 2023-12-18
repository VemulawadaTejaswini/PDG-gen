import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int s[] = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			s[i] = sc.nextInt();
			sum += s[i];
		}
		
		Arrays.sort(s);
		int cnt = 0;
		while(true) {
			if(sum % 10 != 0) {
				break;
			}
			if(s[cnt] % 10 != 0) {
				sum -= s[cnt];
			}
			if(cnt == N - 1) {
				sum = 0;
				break;
			}
			cnt++;
		}
		System.out.println(sum);
	}
}
