import java.util.Scanner;
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int H = sc.nextInt(), W = sc.nextInt();
			if(H == 0 && W == 0) break;
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
