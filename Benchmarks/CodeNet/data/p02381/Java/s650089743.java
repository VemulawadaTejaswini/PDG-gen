import java.util.*;
 
class Main{
    public static void main(String[] args){
		int n;
		double avr = 0.0;
		double ans = 0.0;
		Scanner scan = new Scanner(System.in);
		while((n = scan.nextInt()) != 0){
			int[] arr = new int[n];
			int sum1 = 0;
			avr = 0.0;
			for(int i=0; i<n; i++){
				int tmp = scan.nextInt();
				arr[i] = tmp;
				sum1 += tmp;
			}
			avr = (double)sum1 / n;
			double sum2 = 0.0;
			for(int i=0; i<n; i++){
				sum2 += (arr[i] - avr) * (arr[i] - avr);
			}
			ans = Math.sqrt(sum2 / n);
			System.out.println(ans);
		}
    }
}