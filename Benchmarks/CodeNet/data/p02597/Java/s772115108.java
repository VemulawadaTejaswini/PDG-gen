import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		char c[] = s.toCharArray();
		int count =0;
		int start =0;
		int last = N-1;
		int minlast=-1;
		int maxstart=N;
		while (start<last) {
			while (start<maxstart&&c[start]=='R') {
				start++;
			}
			while (last>minlast&&c[last]=='W') {
				last--;
			}
			if (start<last) {
				c[start]= 'R';
				c[last] = 'W';
				count ++;
				maxstart = last;
				minlast = start;
			} else {
				break;
			}
		}
		System.out.println(count);
	}
}
