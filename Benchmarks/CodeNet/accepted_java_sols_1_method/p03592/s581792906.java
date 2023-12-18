
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		int k = Integer.parseInt(sc.next());
		
		int now = 0;
		boolean jdg = false;
		
		for(int i = 0 ; i <= w ;i++) {
			for(int j = 0 ; j <= h ; j++) {
				now = h * i + w * j - (i * j * 2);
				//System.out.println(now);
				if(now == k) {
					jdg = true;
					break;
				}
			}
		}
		
		
		if(jdg) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
