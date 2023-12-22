import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] x = new int[n];
		int[] y = new int[n];
		int[] dt = new int[n];
		int[] dx = new int[n];
		int[] dy = new int[n];
		t[0] = sc.nextInt();
		x[0] = sc.nextInt();
		y[0] = sc.nextInt();
		dt[0] = t[0];
		dx[0] = x[0];
		dy[0] = y[0];
		for(int i=1; i<n; i++){			
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			dt[i] = t[i] - t[i-1];
			dx[i] = x[i] - x[i-1];
			dy[i] = y[i] - y[i-1];
		}
		boolean bl = true;
		for(int i=0; i<n; i++){
			if(dx[i]+dy[i]>dt[i] || (dx[i]+dy[i]+dt[i])%2!=0){
				bl = false;
				break;
			}
		}
		System.out.println(bl==true ? "Yes" : "No");
	}
}