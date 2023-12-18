import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();
		int n = 0;
		if(input >= 1 && input <= 20)n = input;
		int a = Integer.MAX_VALUE;
		int v = Integer.MIN_VALUE;

		for(int i = 0 ; i < n ; i++) {
			int num = scan.nextInt();
			int fishNum = scan.nextInt();
			if(fishNum > v) {
				v = fishNum;
				a = num;
			}else if(fishNum == v) {
				a = Integer.min(a, num);
			}
		}
		System.out.println(a + " " + v);
		scan.close();
	}

}

