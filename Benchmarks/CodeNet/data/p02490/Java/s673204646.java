import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		for(int i = 0;;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x == 0 && y == 0) {
				break;
			}
			if(x > y) {
				a = x;
				x = y;
				y = a;
			}
			System.out.println(x+" "+y);
		}

	}

}