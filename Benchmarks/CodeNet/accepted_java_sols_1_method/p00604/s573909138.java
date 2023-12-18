import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		
		while(sn.hasNext()){
			int n = sn.nextInt();
			int[] times = new int[n];
			for(int i = 0; i < n; i++){
				times[i] = sn.nextInt();
			}
			Arrays.sort(times);
			int sum = 0;
			int m = n;
			for(int i = 0; i < n; i++){
				sum += times[i]*m;
				m--;
			}
			System.out.println(sum);
		}
	}
}