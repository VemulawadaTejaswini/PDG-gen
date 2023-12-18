import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H;
		int W;
		
		while (true) {
			do
			{
				H = sc.nextInt();
				W = sc.nextInt();
			}
			while(H >= 300 &&  W>= 300);
			
			if (H == 0 && W == 0) {
				break;
			}
			for (int j = 0; j < W; j++) {
				
				for (int i = 0; i < H; i++)
					System.out.print("#");
				System.out.println("#");
			}
			
			System.out.print("\n");
		}
	}

}