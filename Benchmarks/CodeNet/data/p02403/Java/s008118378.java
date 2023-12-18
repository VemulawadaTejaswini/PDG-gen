import java.util.Scanner;
class Main {
	int W = 0,H = 0,I = 0,F = 0;
	public void pr() {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		while(H != 0 || W != 0) {
			for(I = 0;I < W; I++) {
				for(F = 0;F < H; F++) {
					System.out.print("#");
					if(F == H-1) {
						System.out.println();
					}
				}
			}
				System.out.println();
			H = sc.nextInt();
			W = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		new Main().pr();
	}
}