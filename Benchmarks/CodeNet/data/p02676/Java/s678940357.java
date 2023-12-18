import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S=sc.next();
		int s=S.length();
		char[] a = S.toCharArray();
		
		if(s<=K) {
			System.out.print(S);
		}
		else {
			for(int i=0;i<K;i++) {
				System.out.print(a[i]);
			}
			System.out.print("...");
		}
		
		sc.close();
	}
}
