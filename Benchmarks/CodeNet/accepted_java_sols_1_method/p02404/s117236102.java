import java.text.*;
import java.math.*;
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
					if(i1 == 0 | i1 == num[0]-1) {
						System.out.print("#");
					}else if(i2 == 0|i2 == num[1]-1) {
						System.out.print("#");
					}else System.out.print(".");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}