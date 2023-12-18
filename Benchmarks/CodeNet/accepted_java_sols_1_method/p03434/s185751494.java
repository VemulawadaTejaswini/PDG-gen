import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int A = 0;
		int B = 0;
		for(int i=n; i>0; i-=2){
			A += a[i];
			B += a[i-1];
		}
		System.out.println(A-B);
	}
}