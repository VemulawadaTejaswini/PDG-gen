import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 while (true) {
		 int n = sc.nextInt();
		 if (n == 0) {
			 break;
			 }
		 int[] scores = new int[n];
		 for (int i = 0; i < scores.length; i++) {
			 scores[i] = sc.nextInt();
		 }
		 double average = 0, variance = 0,sum2=0;
		 int sum1=0,i;
		 for(i=0;i<n;i++){
			 sum1=sum1+scores[i];
		 }
		 average=(double)sum1/n;
		 for(i=0;i<n;i++){
			 sum2=sum2+(scores[i]-average)*(scores[i]-average);
		 }
		 variance=(double)sum2/n;
		 System.out.println(Math.sqrt(variance));
		 }
	 }
}