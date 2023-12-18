import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int sides, widthsum, nextnum, total;

		for(;;){
			total = 0;
			sides = scanner.nextInt();
			int[] heightsum = new int[sides];
			if(sides == 0) break;
			for(int i = 0; i < sides; i++){
				widthsum = 0;
				for(int j = 0; j < sides; j++){
					nextnum = scanner.nextInt();
					widthsum += nextnum;
					heightsum[j] += nextnum;
					System.out.printf("%5d", nextnum);
				}
				total += widthsum;
				System.out.printf("%5d\n", widthsum);
			}
			for(int j = 0; j < sides; j++) System.out.printf("%5d", heightsum[j]);
			System.out.printf("%5d\n", total);
		}
	}

}