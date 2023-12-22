import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] hav = new int[M];
		for(int i=0;i<N;i++) {
			int K = sc.nextInt();
			for(int j=0;j<K;j++) {
				hav[sc.nextInt()-1]++;
			}
		}
		int count = 0;
		for(int i=0;i<M;i++) {
			if(hav[i]==N) count++;
		}
		System.out.println(count);
	}
}