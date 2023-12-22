import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			double sum=0;
			if (n == 0) {
				break;
			}
			int[] scores = new int[n];
			for (int i = 0; i < scores.length; i++){
				scores[i] = sc.nextInt();
				sum+=scores[i];
			}
			double average = 0, variance = 0;
			average=sum/n;
			for(int j=0;j<scores.length;j++){
				variance+=(scores[j]-average)*(scores[j]-average)/n;
			}
			System.out.println(Math.sqrt(variance));
		}
	}
} 