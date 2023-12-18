import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
			while(true) {
				long H = sc.nextInt();
				long W = sc.nextInt();

				if (H == 0 && W == 0) break;

				StringBuilder sb = new StringBuilder();
				String pattern[] = {"#", "."};

				for (int i = 0; i < H; i++) {
					for (int j = 0; j < W; j++) {
						if(i % 2 == 0) {
							sb.append(pattern[j % 2]);
						} else {
							sb.append(pattern[(j + 1) % 2]);
						}
					}
					sb.append("\n");
				}

				System.out.println(sb.toString());
			}
		}
	}
}
