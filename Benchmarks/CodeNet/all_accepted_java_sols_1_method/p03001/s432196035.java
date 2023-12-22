
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long w = sc.nextLong();
		long h = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		double ans = (double)w*(double)h/2;
		boolean jdg = false;
		if(w%2 == 0 && h%2 == 0) {
			if(w/2 == x && h/2 == y) {
				jdg = true;
			}
		}
		
		System.out.print(ans);
		System.out.print(" "); 
		if(jdg) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		sc.close();
	}


}
