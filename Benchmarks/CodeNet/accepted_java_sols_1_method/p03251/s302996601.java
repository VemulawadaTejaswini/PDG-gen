import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[m];
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
		}
		for(int i=0; i<m; i++){
			y[i] = sc.nextInt();
		}
		Arrays.sort(x);
		Arrays.sort(y);
		boolean bl = false;
		for(int i=X+1; i<=Y; i++){
			if(x[n-1]<i && i<=y[0]){
				bl = true;
				break;
			}
		}
		System.out.println(bl==true ? "No War" : "War");
	}
}