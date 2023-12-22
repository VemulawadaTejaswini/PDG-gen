import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] ax = new long [n];
		
		long max =0;
		long min =0;
		long sum =0;
		
		int i = 0;
		while(i<n){
			ax[i] = sc.nextLong();
			if(i==0){
				max = ax[0];
				min = ax[0];
			}
			else{
				if(max < ax[i]){
					max = ax[i];
				}
				else if(min > ax[i]){
					min = ax[i];
				}
			}
			sum += ax[i];
			i++;
		}
		
		System.out.println(min+" "+max+" "+sum);
	}
}