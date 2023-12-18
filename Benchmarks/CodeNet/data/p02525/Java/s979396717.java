import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0){ break; }
			int[] scores = new int[n];
			int sum = 0;
			for(int i = 0;i < n; i++){
				scores[i] = sc.nextInt();
				sum += scores[i];
			}
			double average, variance,temp = 0;
			average = (double)sum/n;
			for(int i = 0;i < n;i++){
				temp+= (double)(scores[i]-average)*(scores[i]-average);
			}
			temp = (double)temp/n;
			variance = Math.sqrt(temp);
			System.out.println(variance);
		}
	}
}