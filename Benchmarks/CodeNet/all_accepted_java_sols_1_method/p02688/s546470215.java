import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] NK = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		boolean[] SNKs = new boolean[NK[0]];
		for(int i = 0; i < NK[1]; i++) {
			scanner.nextLine();
			int[] Ais = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).map(in -> in - 1).toArray();
			for(int Ai: Ais) {
				SNKs[Ai] = true;
			}
		}
		int count = 0;
		for(boolean SNK: SNKs) {
			if(!SNK) count++;
		}
		System.out.println(count);
	}
}
