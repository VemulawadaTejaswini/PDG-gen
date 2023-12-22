import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int toi = Integer.parseInt(scanner.nextLine());
		String bin = "";

		while( toi != 0) {
			if(toi % -2 == 0) {
				bin = "0" + bin;
			}else if(toi % -2 != 0) {
				bin = "1" + bin;
				toi--;
			}

			toi /= -2;
		}

		if(bin.equals("")) {
			bin = "0";
		}

		System.out.println(bin);


	}
}
