import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N];
		Arrays.setAll(L, i -> sc.nextInt());
		int ans = 0;
		for(int i = 0; i < N; i++)
			for(int j = i+1; j < N; j++)
				for(int k = j+1; k < N; k++)
					if(L[i] != L[j] && L[j] != L[k] && L[i] != L[k] && L[i]+L[j]>L[k] && L[i]+L[k]>L[j] &&L[k]+L[j]>L[i])
						ans++;
		System.out.println(ans);
	}

}
