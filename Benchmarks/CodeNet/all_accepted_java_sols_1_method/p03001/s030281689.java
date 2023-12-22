import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		double area = (double)w * (double)h / 2.0;
		System.out.printf("%f %d\n", area, x*2 == w && y*2 == h ? 1 : 0 );
	}
}
