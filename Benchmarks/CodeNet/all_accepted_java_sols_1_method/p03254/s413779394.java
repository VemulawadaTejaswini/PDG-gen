import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] kidsInfo = new int[n];
		int answer = 0;
		for(int i=0;i <n;i++) {
			kidsInfo[i] = sc.nextInt();
		}
		Arrays.sort(kidsInfo);
		for(int kids :kidsInfo) {
			if(kids <= x) {
				answer++;
				x-= kids;
			}else {
				break;
			}
		}
		if(x >=1 && answer ==n) {
			answer--;
		}
		System.out.println(answer);
	}
}