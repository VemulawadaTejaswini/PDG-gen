import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	 // ?¨??????\???????????????????????????????????????
	 Scanner sc = new Scanner(System.in);
	 while (true) {
	 int n = sc.nextInt();
	 if (n == 0) { break; }
	 int[] scores = new int[n];
	 for (int i = 0; i < scores.length; i++) {
	 scores[i] = sc.nextInt();
	 }
	 
	 double ave = 0, variance = 0,sum = 0;
	 
	 for(int i = 0; i < n; i++){
		sum += scores[i];
		}
	 ave = sum/n;
	 double m = 0;
	 
	 for(int i = 0; i < n; i++){
		 m += Math.pow( (ave - scores[i]), 2);
	 }
	 variance = m/n;
	 System.out.println(Math.sqrt(variance));
	 }
	 }
	}