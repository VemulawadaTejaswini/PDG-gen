import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String b=scan.next();
	if(b.charAt(0)=='A') {
		System.out.println("T");
	}
	else if(b.charAt(0)=='T'){
		System.out.println("A");
	}
	else if(b.charAt(0)=='G') {
		System.out.println("C");
	}
	else if(b.charAt(0)=='C') {
		System.out.println("G");
	}
	}

}