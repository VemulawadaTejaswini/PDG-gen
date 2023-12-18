import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//split??????????????§????????????????§£????????£??\
		String[] lines = sc.nextLine().split(" ");
		int width = Integer.parseInt(lines[0]);
		int height = Integer.parseInt(lines[1]);
		int x = Integer.parseInt(lines[2]);
		int y = Integer.parseInt(lines[3]);
		int r = Integer.parseInt(lines[4]);
		String result;

		if(x - r >= 0 && x + r <= width && y - r >= 0 && y + r <= height) {
			result = "Yes";
		} else {
			result = "No";
		}



		System.out.println(result);

	}
}