import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String yohou  = scanner.nextLine();
		String zissai = scanner.nextLine();

		int count = 0;

		scanner.close();

		for(int i=0; i<3; i++) {

			if(yohou.charAt(i) == zissai.charAt(i)){

				count++;

			}else {

				continue;

			}

		}

		System.out.println(count);

	}

}