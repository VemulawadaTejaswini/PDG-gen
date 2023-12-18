import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); //w
		sc.nextInt(); //h
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		long ans = 0;
		for(int i=0;i<n-1;i++) {
			ans += dist(x[i],y[i],x[i+1],y[i+1]);
		}
		System.out.println(ans);
	}

	public static int dist(int x1,int y1,int x2,int y2) {
		if ((x1 < x2 && y1 < y2) || (x1 > x2 && y1 > y2)) {
			return Math.max(Math.abs(x1-x2), Math.abs(y1-y2));
		}else{
			return Math.abs(x1-x2) + Math.abs(y1-y2);
		}
	}

}