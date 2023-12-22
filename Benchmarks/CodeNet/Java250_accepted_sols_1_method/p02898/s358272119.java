import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int friend = scan.nextInt();
		int height = scan.nextInt();
		int[] Fheight = new int[friend];
		int count = 0;

		for(int i=0;i<friend;i++) {

			Fheight[i] = scan.nextInt();
		}

		for(int i=0;i<friend;i++) {
			if(Fheight[i] >= height) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();

	}

}
