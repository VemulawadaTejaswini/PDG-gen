import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		
		if(a < b) c = b - (a+w);
		if(b < a) c = a - (b+w);

		if(a == b || c < 0){
			System.out.println(0);
		} else {
			System.out.println(c);
		}
	}
}