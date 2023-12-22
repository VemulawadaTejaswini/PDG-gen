import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = Integer.parseInt(input.nextLine());
		int W = Integer.parseInt(input.nextLine());
		
		int[] v = new int[N];
		
		for(int i = 0; i < N; i++) v[i] = i;
		
		for(int i = 0; i < W; i++) {
			String[] s = input.nextLine().split("[,]");
			int a = Integer.parseInt(s[0]) - 1;
			int b = Integer.parseInt(s[1]) - 1;
			
			int tmp = v[a];
			v[a] = v[b];
			v[b] = tmp;			
		}
		for(int i = 0; i < N; i++) {
			System.out.println(v[i] + 1);			
		}
		System.exit(0);
	}
}