import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			int[] array = new int[n];
			for(int i=0;i<n;i++){
				array[i]=sc.nextInt();
			}
			double average =0;
			double variance = 0;
			for(int i=0;i<n;i++){
				average += (double)array[i]/n;
			}
			for(int i=0;i<n;i++){
				variance += (double)Math.pow(array[i]-average,2)/n;
			}
			System.out.println(Math.sqrt(variance));
		}
	}

}