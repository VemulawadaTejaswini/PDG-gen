import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	// 2018/05/29
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		String s[] = new String[N];
		for (int i=0; i<N; i++) {
			s[i] = sc.next(); 
		}
		Arrays.sort(s);
		for (int i=0; i<N; i++) {
			System.out.print(s[i]); 
		}
	}
}
