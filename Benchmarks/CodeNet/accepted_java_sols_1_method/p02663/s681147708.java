
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] h1 = new int[2];
		int [] h2 = new int [2];
		
		h1[0] = Integer.parseInt(sc.next())*60;
		h1[1] = Integer.parseInt(sc.next());
		h2[0] = Integer.parseInt(sc.next())*60;
		h2[1] = Integer.parseInt(sc.next());
		
		int k = Integer.parseInt(sc.next());
		
		int get = h1[0] + h1[1];
		int sle = h2[0] + h2[1];
		
		sle -= k;
		System.out.println(sle -get);
	}

}
