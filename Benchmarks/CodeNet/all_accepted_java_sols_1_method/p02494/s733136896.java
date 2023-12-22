import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			int i = stdIn.nextInt();
			int j = stdIn.nextInt();
			if(i == 0 && j == 0) break;
			for(int r = 0; r < i; r++) {
				for(int c = 0; c < j; c++)
					System.out.print("#");
				System.out.println();
			}
			System.out.println();
		}
	}

}