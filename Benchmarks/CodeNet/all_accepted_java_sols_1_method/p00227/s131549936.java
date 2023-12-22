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
			for(int i = 0;i < n;i++){
				p[i] = scan.nextInt();
			}
			Arrays.sort(p);
			int sum = 0;
			int count = 0;
			for(int i = 0;i < n;i++){
				if(count == m-1){
					count = 0;
					continue;
				}
				sum += p[n-1-i];
				count++;
			}
			System.out.println(sum);			
		}
	}
}