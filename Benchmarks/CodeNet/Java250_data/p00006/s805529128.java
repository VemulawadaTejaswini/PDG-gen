import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		StringBuffer buf = new StringBuffer(str);
		
		buf.reverse();
		str = buf.toString();
		
		System.out.println(str);
		scan.close();
	}
}