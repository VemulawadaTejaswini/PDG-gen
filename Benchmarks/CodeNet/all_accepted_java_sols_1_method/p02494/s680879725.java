import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			for(int i = 0; i < H ; i++){
				for(int j = 0; j < W; j++){
					System.out.printf("#");
				}
				System.out.printf("\n");
			}
		if (H == 0 || W == 0) break;
		System.out.printf("\n");
		}
	}
}
			