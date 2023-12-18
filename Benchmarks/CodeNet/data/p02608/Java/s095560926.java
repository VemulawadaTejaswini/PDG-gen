import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ans = new int[N];
		for(int i = 1; i <= 100; i++)
			for(int j = 1; j <= 100; j++)
				for(int k = 1; k <= 100; k++)
					if(i*i+j*j+k*k+i*j+j*k+k*i <= N)
						ans[i*i+j*j+k*k+i*j+j*k+k*i-1]++;
		for(int i = 0; i < N; i++)
			System.out.println(ans[i]);
	}

}
