import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int teiin = sc.nextInt();
		int angryTime = sc.nextInt();
		int[] customerInfo = new int[n];
		for(int i =0;i <n;i++) {
			customerInfo[i] = sc.nextInt();
		}
		Arrays.sort(customerInfo);
		int answer = 0;
		int joshaSu = 0;
		int firstJoshaTime = 0;
		for(int i = 0;i <n;i++) {
			if(joshaSu == 0) {
				firstJoshaTime = customerInfo[i];
			}
			if(joshaSu < teiin && customerInfo[i] -firstJoshaTime <= angryTime) {
				joshaSu++;
			}else {
				answer++;
				joshaSu = 1;
				firstJoshaTime = customerInfo[i];
			}

			if(i == n-1) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}