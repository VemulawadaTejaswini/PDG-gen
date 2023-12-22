import java.util.*;
public class Main {
		
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int count = 0;
		for(int i=1;i<=N;i++) {
			String S = Integer.toString(i);
			// 111 -> "111"
			int length = S.length();
			// "111" -> 3
			if(length % 2 == 1)count++;
		}
		System.out.println(count);
	}
	
}