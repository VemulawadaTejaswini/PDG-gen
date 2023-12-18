import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num= new int[2];

		while(true) {
			num[0] = scan.nextInt();
			num[1] = scan.nextInt();
			if(num[0] == 0) break;
			for(int i1 = 0; i1 < num[0];i1++) {
				for(int i2 = 0;i2 < num[1];i2++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}