import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int monsterCount = sc.nextInt();
		int extraAttackCount = sc.nextInt();
		long answer = 0;

		int[] monsterArray = new int[monsterCount];
		for(int i = 0; i < monsterCount; i++) {
			monsterArray[i] = sc.nextInt();
		}
		Arrays.sort(monsterArray);

		for(int i =0; i < monsterCount -extraAttackCount; i++) {
			answer += monsterArray[i];
		}
		System.out.println(answer);
	}
}
