import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int lineNumber = stdin.nextInt();
		int lineAdd = stdin.nextInt();
		int[] box = new int[lineAdd];

		for(int i = 0; i < lineNumber; i++) {

				box[i] = i + 1;
			}

		for(int i2 = 0;i2 < lineAdd; i2++) {
			String[] box2 = stdin.next().split(",");
			int left = Integer.parseInt(box2[0]);
			int right = Integer.parseInt(box2[1]);

			int exchange = box[left];
			box[left] = box[right];
			box[right] = exchange;
		}
		for(int i3 = 1; i3 < lineNumber; i3++){
			System.out.println(box[i3]);
		}

	}

}