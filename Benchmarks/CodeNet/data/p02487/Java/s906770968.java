import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int j=0,k=0;
		int height;
		int width;
		while (true) {
			height = scanner.nextInt();
			width= scanner.nextInt();

			if (height == 0 && width == 0) {
				break;
			}

			for(j=0;j<height;j++){
				for(k=0;k<width;k++){
					if(j==0||k==0||k==(width-1)||j==(height-1))
						System.out.print("#");
					else
						System.out.print(".");
				}
					System.out.println("");
			}



		}
		scanner.close();
	}
}