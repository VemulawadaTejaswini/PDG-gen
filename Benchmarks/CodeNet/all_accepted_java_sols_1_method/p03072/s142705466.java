import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		for(int i = 0; i < N; i++) H[i] = sc.nextInt();
		int ans = 1;
		for(int i = 1; i < N; i++) {
			boolean canSee = true;
			for(int j = 0; j < i; j++) {
				if(H[i] < H[j]) canSee = false;
			}
			if(canSee) ans++;
		}
		System.out.println(ans);
	}
}