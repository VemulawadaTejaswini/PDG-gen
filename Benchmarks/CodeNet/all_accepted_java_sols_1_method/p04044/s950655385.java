import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N個
		int L = sc.nextInt(); //長さL
		
		String[] stvals = new String[N];
		for(int i=0;i<N;i++) {
			stvals[i] = sc.next();
		}
		Arrays.sort(stvals);
		for(String s:stvals) {
			System.out.print(s);
		}
		System.out.println();
		
		sc.close();
	}	

}