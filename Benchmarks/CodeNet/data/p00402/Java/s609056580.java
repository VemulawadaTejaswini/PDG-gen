import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] ban = new int[N];
		for(int i = 0; i < N; i++) ban[i] = s.nextInt();
		Arrays.sort(ban);
		System.out.println((ban[N - 1] - ban[0] + 1) / 2);
	}
}
