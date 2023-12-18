import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] S = new int[n+1];

		String[] s = br.readLine().split(" ")
		for(int i = 0; i < n; i++){
			S[i] = Integer.parseInt(s[i]);
		}
		int q = Integer.parseInt(br.readLine());
		int[] T = new int[q];
		s = br.readLine().split(" ");
		for(int i = 0; i < q; i++){
			T[i] = Integer.parseInt(s[i]);
		}
		
		int C = 0;
		for(int i = 0; i < q; i++){
			boolean flag = linearSearch(T[i], S, n);
			if(flag == true)
				C++;
		}
		System.out.printf("%d\n", C);
	}

	// ????????????????????¢????´¢
	private static boolean linearSearch(int key, int[] A, int n){
		int i = 0;
		A[n] = key;
		while(A[i] != key){
			i++;
		}
		if(i == n)
			return false;
		return true;
	}
}