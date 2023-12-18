import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int H[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			H[i] = sc.nextInt();			
		}
		boolean good[] = new boolean[N];
		Arrays.fill(good, true);
		for(int i = 0 ; i < M ; ++i){
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if(H[a] <= H[b]){
				good[a] = false;
			}
			if(H[b] <= H[a]){
				good[b] = false;
			}
		}
		int ret = 0;
		for(boolean g : good){
			if(g){
				++ret;
			}
		}
		System.out.println(ret);
	}
}
