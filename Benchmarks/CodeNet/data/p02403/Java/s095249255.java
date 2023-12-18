import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = 5;
		int W = 5;
		while(!(H == 0 && W == 0)) {
			H = scan.nextInt();
			W = scan.nextInt();
			for (int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					System.out.print("#");
				} System.out.println("");
			}

}
}
}
