import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int sunukeCount = sc.nextInt();
		int okashiCount = sc.nextInt();
		int itazuraCount = 0;
		boolean[] itazuraFlag = new boolean [sunukeCount];
		for (int i = 0; i < sunukeCount; i++) {
				itazuraFlag[i] = true;
		}

		for (int i = 0; i < okashiCount; i++) {
			int dCount = sc.nextInt();
			for (int j = 0; j < dCount; j++) {
				int tmp = sc.nextInt();
				tmp--;
				itazuraFlag[tmp] = false;
			}
		}

		for (int i = 0; i < sunukeCount; i++) {
			if (itazuraFlag[i] == true) {
				itazuraCount++;
			}
		}

		System.out.print(itazuraCount);

	return;

	}
}
