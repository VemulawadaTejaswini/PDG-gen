import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] r = new int[n];
		int[] c = new int[m*2];
		for(int i=0; i<m*2; i++){
			c[i] = sc.nextInt();
		}
		for(int i=0; i<m*2; i++){
			r[c[i]-1]++;
		}
		for(int i=0; i<n; i++){
			System.out.println(r[i]);
		}
	}
}