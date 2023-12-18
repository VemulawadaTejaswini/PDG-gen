import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			long sum = 0;
			for(int i = 0;i < n;i++){
				sum += scan.nextInt();
			}
			int[] joint = new int[n-1];
			for(int i = 0;i < n-1;i++){
				joint[i] = scan.nextInt();
			}
			Arrays.sort(joint);
			long max = (n-1)*(sum+joint[n-2]);
			long t = 0;
			for(int i = 1;i < n-1;i++){
				t = (n-(i+1))*(sum+joint[n-(i+2)]);
				if(max > t){
					break;
				}
				max = t;
			}
			t = n*sum;
			System.out.println((max > t)?max:t);
		}
	}
}