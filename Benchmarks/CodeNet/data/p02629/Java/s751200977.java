import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		StringBuilder sb = new StringBuilder();
		int index = 1;
		while (0 < N) {
			long i = N%26;
			if (i == 0) {
				i =26;
			}
			sb.append((char) ('a'-1+i));
			N -= Math.pow(26, index);
			index++;
		}
		System.out.println(sb.reverse());
	}
}