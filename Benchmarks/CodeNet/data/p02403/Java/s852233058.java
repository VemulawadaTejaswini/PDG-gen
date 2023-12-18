import java.util.Scanner;
class Main{
	public void Germany() {
		Scanner sc = new Scanner(System.in);
		int H,W;
		H = sc.nextInt();
		W = sc.nextInt();
		while(H != 0 && W != 0){
			for(int i = 1;i <= H;i++) {
				for(int x = 1;x <= W;x++) {
					System.out.print("#");
				}
				System.out.print("\n");
			}
			System.out.println( );
			H = sc.nextInt();
			W = sc.nextInt();
		}
	}
	public static void main(String[] args) {
			new Main().Germany();
	}
}