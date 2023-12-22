import java.util.Scanner;
public class Main {
	
	static char[] k = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String W = stdIn.next();
		W = W.toLowerCase();
		int k = 0;
		while(true) {
			String T = stdIn.next();
			if(T.equals("END_OF_TEXT")) {
				break;
			}
			T = T.toLowerCase();
			if(T.equals(W)) {
				k++;
			}
		}
		System.out.println(k);
	}
}