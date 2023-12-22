import java.util.Scanner;
class Main {
	public void ci() {
		Scanner sc = new Scanner(System.in);
		int x0 = 0,y0 = 0;
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		if(x - r >= 0) {
			if(y - r >= 0) {
				if(x + r - W <= 0) {
					if(y + r - H <= 0) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				} else { 
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		new Main().ci();
	}
}