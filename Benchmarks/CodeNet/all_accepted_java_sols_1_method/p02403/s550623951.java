import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int width, height;
		int w, h;

		height = sc.nextInt();
		width = sc.nextInt();

		while(height != 0 || width != 0){
			for(h = 0;h < height;h++){
				for(w = 0;w < width;w++){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
			height = sc.nextInt();
			width = sc.nextInt();
		}

	}
}
