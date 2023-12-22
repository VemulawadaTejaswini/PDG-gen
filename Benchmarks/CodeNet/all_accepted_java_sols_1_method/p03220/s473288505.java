import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int t = sc.nextInt();
		int a = sc.nextInt();
		double mindiff = Double.MAX_VALUE;
		
		int check = 0;
		int[] h = new int[n];
		
		for(int i = 0;i<n;i++) {
			h[i] =sc.nextInt();
			double T = t-h[i] * 0.006;
			double diff = Math.abs(a-T);
			if(mindiff > diff) {
				mindiff = diff;
				check = i;
			}
		}
		System.out.println(check+1);
	}
}