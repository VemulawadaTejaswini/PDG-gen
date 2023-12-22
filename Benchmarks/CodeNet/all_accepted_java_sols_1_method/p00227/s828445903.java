import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			int[] p = new int[n];
			int sum = 0;
			for(int i = 0;i < n;i++){
				p[i] = scan.nextInt();
				sum += p[i];
			}
			Arrays.sort(p);
			for(int i = m-1;i < n;i+=m){
				sum -= p[n-1-i];
			}
			System.out.println(sum);			
		}
	}
}