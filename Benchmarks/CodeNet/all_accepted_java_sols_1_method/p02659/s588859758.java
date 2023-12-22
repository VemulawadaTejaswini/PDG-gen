import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		String b = sc.next();
		String d = "";
		
		for(int i = 0; i< b.length(); i++) {
			if(b.charAt(i) == '.') {
				continue;
			}
			d+=b.charAt(i);
		}
		int c= new Integer(d).intValue();
		System.out.println(a*c/100);
	}
}