import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] l = new long[n];

		for (int i=0; i<n; i++){
			l[i] = sc.nextLong();
		}
		Arrays.sort(l);
		int ans = 0;
		for (int i=0; i<n-2; i++){
			for (int j=i+1; j<n-1; j++){
				for (int k=j+1; k<n; k++){
					if (l[i] != l[j] && l[j] != l[k] && l[i] != l[k]){
						if (l[i] + l[j] > l[k]){
							ans++;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}


}