
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i=0;i<n;i++){
			x[i] = stdIn.nextInt();
		}
		for(int i=0;i<n;i++){
			y[i] = stdIn.nextInt();
		}
		double ans1 = 0;
		double ans2 = 0;
		double ans3 = 0;
		double ans4 = 0;
		
		for(int i=0;i<n;i++){
			ans1 += Math.abs(x[i]-y[i]);
			ans2 += Math.pow(x[i]-y[i],2);
			ans3 += Math.abs(Math.pow(x[i]-y[i],3));
			if(ans4<Math.abs(x[i]-y[i])){
				ans4 = Math.abs(x[i]-y[i]);
			}
		}
		
		ans2 = Math.sqrt(ans2);
		ans3 = Math.pow(ans3,1.0/3.0);
		
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
	}
}