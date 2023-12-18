import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	public void run() {
		int H, W = 0;
		String s = null;
		
		while (true) {		
			H = sc.nextInt();
			W = sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (i % 2 == 0) { // 奇数行
						ln((j % 2 == 0) ? "#" : ".");
					} else { // 偶数行
						ln((j % 2 == 0) ? "." : "#");						
					}
				}
				System.out.printf("%n");
			}
			System.out.printf("%n");
		} 
		sc.close();
	}

	public static void main(String[] srgs) {		
	    Main main = new Main();
		main.run();
	}
	
	public static void ln(String s) {
		System.out.printf("%s", s);
	}
}


