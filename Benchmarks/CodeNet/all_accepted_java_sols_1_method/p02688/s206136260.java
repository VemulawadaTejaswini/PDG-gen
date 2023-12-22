import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	int K = sc.nextInt();
	int d = 0;
	int a = 0;
	int[] c = new int[N]; 
	int ans = 0;

	for (int i = 0; i < K; i++) {
		d = sc.nextInt();
		for (int j = 0; j < d; j++) {
			a = sc.nextInt();
			c[a-1]++;
		}
	}

	for (int i = 0; i < N; i++) {
		if (c[i] == 0) ans++;
	}


	System.out.println(ans);

        sc.close();
    }    
}
