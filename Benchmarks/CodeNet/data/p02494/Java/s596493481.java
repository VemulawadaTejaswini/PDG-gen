import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=0,j=0,k=0,l=0;
		int height[]= new int[10000];
		int width[]= new int[10000];
		while (true) {
			height[i] = scanner.nextInt();
			width[i]= scanner.nextInt();

			if (height[i] == 0 && width[i] == 0) {
				break;
			}

			i++;
		}

		for(l=0;l<i;l++){
			for(j=0;j<height[l];j++){
				for(k=0;k<width[l];k++)
					System.out.print("#");
				System.out.println("");
			}

		}

		scanner.close();
	}
}