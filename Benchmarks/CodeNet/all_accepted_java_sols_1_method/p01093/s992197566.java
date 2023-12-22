import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n!=0){
			int[] a = new int[n];
			for(int i=0; i<n; i++){
	 			a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			int min = a[1] - a[0];
			for(int i=1; i<=n-2; i++){
				min = Math.min(min, a[i+1]-a[i]);
			}
			System.out.println(min);
			n = sc.nextInt();
		}
	}
}
