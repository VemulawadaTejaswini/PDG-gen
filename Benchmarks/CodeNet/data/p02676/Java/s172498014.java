import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		int K = in.nextInt();
		char[] S = in.next().toCharArray();


		StringBuilder sb = new StringBuilder();
		if (S.length > K) {
			for(int i=0;i<K;i++) {
				sb.append(S[i]);
			}
			sb.append("...");
		} else {
			sb.append(S);
		}


		System.out.println(sb.toString());
 
	}

 
	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}