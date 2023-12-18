import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String N = in.next();
		String[] Array = N.split("");
		int a = 0;
		
		for(int i=0; i<Array.length; i++) {
			a += Integer.parseInt(Array[i]);
		}
		
		if(a % 9 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
