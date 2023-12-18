import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String a = stdIn.next();
		String b = stdIn.next();
		
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		
		for(int i = 0; i < bb-1; i++) {
			a += a.substring(0,1);

		}
		for(int i = 0; i < aa-1; i++) {
			b += b.substring(0,1);
		}
		
		if(a.compareTo(b)>0) {
			System.out.println(b);
		}else {
			System.out.println(a);
		}
		
	}

}
