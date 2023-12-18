import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int height, width;
		int h, w;

		height = sc.nextInt();
		width = sc.nextInt();

		while(height != 0 || width != 0){
			for(w = 0;w < width;w++){
				System.out.print("#");
			}
			System.out.println();
			for(h = 0;h < height - 2;h++){
				System.out.print("#");
				for(w = 0;w < width - 2;w++){
					System.out.print(".");
				}
				System.out.println("#");
			}
			for(w = 0;w < width;w++){
				System.out.print("#");
			}
			System.out.println("\n");
			height = sc.nextInt();
			width = sc.nextInt();
		}
	}
}
