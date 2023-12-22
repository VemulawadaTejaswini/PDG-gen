import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] mochiArray = new int[n];
		for(int i =0;i <n;i++) {
			mochiArray[i] = sc.nextInt();
		}
		Arrays.sort(mochiArray);
		int answer = 1;
		for(int i =1;i <n;i++) {
			if(mochiArray[i] == mochiArray[i-1]) {
				continue;
			}else {
				answer++;
			}
		}
		System.out.println(answer);
	}
}