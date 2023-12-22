import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		sc.close();

		int count = 1;
		if(N <= 26) {
			int ans = (int) N - 1;
			System.out.println((char)('a' + ans));
			return;
		}

		long checkDigits = N;
		for(int i = 1; ;i++) {
			checkDigits -= (int) Math.pow(26, i);
			if(checkDigits > 0) {
				count++;
			}else {
				break;
			}
		}

		StringBuffer sb = new StringBuffer();
		while(N > 0) {
			long mod =  N % 26;
			if (mod == 0) {
                N--;
                mod = 25;
            } else {
                mod--;
            }
			sb.append((char)('a' + mod));
			N /= 26;
		}
		System.out.println(sb.reverse().toString());
	}

}