import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char s[] = scan.next().toCharArray();
		char zero_start[] = new char[s.length];
		char one_start[] = new char[s.length];

		int zero_count = 0;
		int one_count = 0;

		for (int i = 0; i < s.length; i++) {
			if (i % 2 == 0) {
				zero_start[i] = '0';
				one_start[i] = '1';
			}else {
				zero_start[i] = '1';
				one_start[i] = '0';
			}
		}

		for(int i = 0; i < s.length; i++) {
			if(s[i] != zero_start[i]) {
				zero_count++;
			}
			if(s[i] != one_start[i]) {
				one_count++;
			}
		}

		System.out.println(Math.min(zero_count, one_count));
	}
}