import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] H = new int[10000];
		int[] W = new int[10000];
		int i = 0;
		while(true) {
			H[i] = scan.nextInt();
			W[i] = scan.nextInt();
			if(H[i] == 0 && W[i] == 0) break;
			i++;
		}
		for(int k = 0; k < i; k++) {
			for(int h = 0; h < H[k]; h++) {
				for(int w = 0; w < W[k]; w++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

