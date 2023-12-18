import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int count = h;

			if(h == 0 && w == 0)
				break;

			for(int j = 0; j < h; j++) {
				if((j % 2) == 1) {
					for(int i = 0; i < w; i++)
						if((i % 2) == 1)
							System.out.print("#");
						else
							System.out.print(".");
				}
				else {
					for(int i = 0; i < w; i++)
						if((i % 2) == 1)
							System.out.print(".");
						else
							System.out.print("#");
				}

				System.out.println("");
			}
			System.out.println("");
		}
	}
}