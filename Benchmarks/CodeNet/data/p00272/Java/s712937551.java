import java.util.*;
public class Main {
	public static void main(String[] args) {
		int t,n;
		int gokei = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i <= 3; i++){
		
			t = scan.nextInt();
			n = scan.nextInt();
			
			if(t == 1) {
				gokei = 6000 * n;
				System.out.println(gokei);
			} else if(t == 2) {
				gokei = 4000 * n;
				System.out.println(gokei);
			} else if(t == 3) {
				gokei = 3000 * n;
				System.out.println(gokei);
			} else if(t == 4) {
				gokei = 2000 * n;
				System.out.println(gokei);
			}
		}
	}
}