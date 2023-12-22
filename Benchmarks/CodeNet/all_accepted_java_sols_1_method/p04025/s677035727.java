import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a [] = new int [N];
		
		for (int i=0; i<N; i++)
			a[i]=sc.nextInt();
		
		Arrays.sort(a);
		int min = a[0];
		int max = a[N-1];
		
		long ans = 1000000000;
		for (int j=min; j<max+1; j++){
			long temp = 0;
			for (int i=0; i<N; i++){
				temp=temp+(a[i]-j)*(a[i]-j);
			}
			ans = Math.min(ans, temp);
			
		}
		System.out.println(ans);
		sc.close();
	}

}