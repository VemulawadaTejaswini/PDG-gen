import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		String[] S = new String[N];
		for(int i = 0;i < N;++i)
			S[i] = sc.next();
		sc.close();
		
		for(int i = 0;i < N;++i) {
			for(int j = i;j < N;++j) {
				if(S[i].compareTo(S[j]) > 0) {
					String cap = S[i];
					S[i] = S[j];
					S[j] = cap;
				}
			}
		}
		
		for(int i = 0;i < N;++i)
			System.out.print(S[i]);
		System.out.println();
	}
}
