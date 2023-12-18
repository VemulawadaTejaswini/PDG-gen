import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int in0 = scan.nextInt();

		for (int i = 0; i < in0; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int z = scan.nextInt();
			
			int x2 = (int)Math.pow(x, 2);
			int y2 = (int)Math.pow(y, 2);
			int z2 = (int)Math.pow(z, 2);
			
			boolean sw = false;
			
			if(x2 == (y2 + z2))sw = true;
			if(y2 == (x2 + z2))sw = true;
			if(z2 == (y2 + x2))sw = true;
			
			if (sw) {
				System.out.println("YES");
			} else System.out.println("NO");
			
		}
	}

}