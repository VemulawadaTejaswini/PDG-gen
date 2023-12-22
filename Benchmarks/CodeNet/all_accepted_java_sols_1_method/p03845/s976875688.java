import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfTest = sc.nextInt(); 
		int[] time = new int[numOfTest];
		int sum = 0;
		for(int i = 0; i < numOfTest; i++) {
			time[i] = sc.nextInt();
			sum += time[i];
		}
		int numOfDrink = sc.nextInt();
		int[] totalTime = new int [numOfDrink];
		for(int j = 0; j < numOfDrink; j++) {
			int i = sc.nextInt();
			totalTime[j] = sum - time[i - 1] + sc.nextInt();
		}
		for(int j : totalTime) {
			System.out.println(j);
		}
	}
}