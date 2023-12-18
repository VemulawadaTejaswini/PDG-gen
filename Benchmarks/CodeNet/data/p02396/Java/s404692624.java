
import java.util.*;

public class Main {
	public static Scanner sc;
	public static void main(String[] args) {
		int x;
		int number = 1;
		while(sc.hasNext()) {
			while((x = sc.nextInt()) < 0 || 10000 < x);
			System.out.println("Case "+ number +": "+ x);
			number++;
			if(x == 0) {
				break;
			}
		}
	}
}

