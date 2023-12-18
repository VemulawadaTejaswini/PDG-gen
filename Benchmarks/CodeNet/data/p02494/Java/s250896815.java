import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);



		while(true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
                        if(x==0 && y==0)break;
			for (int j = 0; j < y; j++) {

				for (int i = 0; i < x; i++) {
					System.out.print("#");
				}
				System.out.print("\n");

			}
			
			System.out.print("\n");

		}
	}
}