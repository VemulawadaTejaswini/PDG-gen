import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int ln = stdin.nextInt();
		int la = stdin.nextInt();
		int[] box = new int[la];

		for(int i = 0; i < ln; i++) {

				box[i] = i + 1;
			}

		for(int i = 0;i < la; i++) {
			String str = stdin.next();
			String[] box2 = stdin.next().split(",");
			int left = Integer.parseInt(box2[0]);
			int right = Integer.parseInt(box2[1]);

			int exchange = box[left];
			box[left] = box[right];
			box[right] = exchange;
		}
		for(int i = 1; i< ln; i++){
			System.out.println(box[i]);
		}

	}

}