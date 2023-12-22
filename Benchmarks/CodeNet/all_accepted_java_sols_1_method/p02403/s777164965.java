import java.util.Scanner;

//20180508
//06

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();

			if(h == 0 && w == 0) {
				break;
			}

			for (int j = 0; j < h;j++) {
				for (int i = 0;i < w;i++) {
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}

    	scanner.close();
    }
}

