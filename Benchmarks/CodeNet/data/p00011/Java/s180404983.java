import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int w = scan.nextInt();
		int[] dl = new int[w];
		for(int i = 0; i < w; i++){
			dl[i] = i + 1;
		}
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int work = dl[a - 1];
			dl[a - 1] = dl[b - 1];
			dl[b - 1] = work;
		}

		for(int i = 0; i < w; i++){
			System.out.printf("%d\n", dl[i]);
		}
	}
}