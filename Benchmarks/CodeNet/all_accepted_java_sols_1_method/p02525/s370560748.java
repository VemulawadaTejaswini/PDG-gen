import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	while(true) {
		int n = sc.nextInt();
		if (n == 0) 
			break;
		int[] scores = new int[n];
		double ave = 0, variance = 0;
		int sum=0;
		for(int i= 0; i< scores.length; i++) {
			scores[i] = sc.nextInt();
			sum+=scores[i];	
			
		}
		ave=(double)sum/n;
		double sum2=0;
		for(int i= 0; i< scores.length; i++){
			sum2+=(scores[i]-ave)*(scores[i]-ave);
			variance=sum2/n;
		}

		
		
		System.out.println(Math.sqrt(variance));
		}
	}
}