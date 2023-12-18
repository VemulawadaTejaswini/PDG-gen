import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mem[][] = new int[n+1][n+1];
		for(int i=1;i<=n;i++) for(int j=1;j<=n;j++) {
			mem[i][j] = sc.nextInt() + mem[i][j-1] + mem[i-1][j] - mem[i-1][j-1];
		}
		int max = mem[1][1];
		for(int i=1;i<=n;i++) for(int j=1;j<=n;j++) for(int k=i;k<=n;k++) for(int l=j;l<=n;l++) 
			max = Math.max(max, mem[k][l] + mem[i-1][j-1] - mem[i-1][l] - mem[k][j-1]);
		System.out.println(max);
	}
}