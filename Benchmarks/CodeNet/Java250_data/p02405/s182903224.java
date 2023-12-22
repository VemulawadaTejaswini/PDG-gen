import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		
		while(true) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			
			if (H == 0 && W == 0)
				break;
			
				for (int i = 0; i < H/2; i++) {
						for (int j = 0; j < W/2; j++) {
							output.append("#").append(".");
						}
						if (W%2 == 1) {
							output.append("#");
						}
						output.append('\n');
						for (int j = 0; j < W/2; j++) {
							output.append(".").append("#");
						}
						if (W%2 == 1) {
							output.append(".");
						}
						output.append('\n');
				}
			if (H%2 == 1) {
				for (int l = 0; l < W/2; l++) {
					output.append("#").append(".");
				}
				if (W%2 == 1) {
					output.append("#");
				}
				output.append('\n');
			}
			output.append('\n');
		}
		System.out.print(output);
	}

}