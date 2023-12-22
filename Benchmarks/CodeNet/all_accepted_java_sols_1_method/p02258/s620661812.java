import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int n = sc.nextInt();	
		int A [] = new int [n+1];
		for (int i=1; i<=n; i++){
			A[i]=sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		int diff= Integer.MIN_VALUE;
		for (int j=1; j<n; j++){
			min = Math.min(min, A[j]);
			diff = Math.max(diff, A[j+1]-min);
		}
		System.out.println(diff);
	}
}