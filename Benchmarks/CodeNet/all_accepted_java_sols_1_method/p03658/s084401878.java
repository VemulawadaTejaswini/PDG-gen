import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] L = new int[N];
		for(int i = 0; i < N; i++) L[i] = sc.nextInt();
		Arrays.sort(L);
		int sum = 0;
		for(int i = 0; i < K; i++) sum += L[N-1-i];
		System.out.println(sum);
	}
}