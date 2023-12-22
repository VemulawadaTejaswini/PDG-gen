import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s;
		String c[] = new String[1000];
		int k=0;
		while(true) {
			s = in.next();
			if(s.equals("push")) {
				c[k] = in.next(); 
				k++;
			}
			if(s.equals("pop")) {
				k--;
				System.out.println(c[k]);
				
			}
			if(s.equals("quit")) break; 
		}
		
	}
}