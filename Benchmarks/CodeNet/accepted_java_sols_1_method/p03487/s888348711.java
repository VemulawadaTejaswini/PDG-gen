import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[] = new int[n+1];

		int cnt = 0;
		for(int i = 0; i < n; i++) {
			int val = Integer.parseInt(sc.next());
			if(val > n) {
				cnt++;
				continue;
			}

			s[val]++;
		}
		int sum = cnt;
		for(int i = 0; i < 100000; i++) {
			if(s[i] < i) {
				cnt += s[i];
			} else if(s[i] > i) {
				cnt += s[i] - i;
			}
			sum += s[i];

			if(n - sum < i) {
				cnt += n - sum;
				break;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
