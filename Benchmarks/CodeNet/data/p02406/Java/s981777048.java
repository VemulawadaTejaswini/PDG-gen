import java.text.*;
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num= new int[1];

		num[0] = scan.nextInt();
		for(int i = 1;i <= num[0]; i++) {
			if(i % 3 == 0) {
				System.out.print(" " + i);
			}else if(i % 10 == 3) System.out.print(" " + i);
		}
	}
}