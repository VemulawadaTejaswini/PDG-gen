import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
                double average = 0,variance = 0;
		while(true){
			int n = sc.nextInt();
			if(n==0){
				break;
			}
			int[] scores = new int[n];
			for(int i =0;i<scores.length;i++){
				scores[i] = sc.nextInt();
			}
			for(int i =0;i<n;i++){
				average += scores[i];
			}
			average =(double)average/n;
			for(int i =0;i<n;i++){
				variance += Math.pow(scores[i]-average,2);
			}
			variance /=n;
			variance=Math.sqrt(variance);
			System.out.printf("%.8f\n",variance);
		}
	}
}