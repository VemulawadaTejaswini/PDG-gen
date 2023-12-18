import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		int H = sc.nextInt();
		int W = sc.nextInt();
		int t, s;
		if(H==0&&W==0){
			break;
		}

		for (int j = 0; j <= H - 1; j++) {
			if (j % 2 == 0) {
				t = 1;
				s = 0;
			} else {
				t = 0;
				s = 1;
			}
			for (int i = 0; i <= W - 1; i++) {
				if (i % 2 == t)
					System.out.printf("#");
				if (i % 2 == s)
					System.out.printf(".");
			}
			System.out.println();
		}
		System.out.println();
		}
	}
}