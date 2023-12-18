import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String kk = stdIn.next();
		int k = Integer.parseInt(kk);
		String xx = stdIn.next();
		int x = Integer.parseInt(xx);
		
		if(k*500>=x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
