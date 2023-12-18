import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h,
		m,
		s;
		
		int i = scan.nextInt();
		h = i / 3600;
		m = ( i % 3600 ) / 60 ;
		s = i % 3600 % 60 ;
		
		
		System.out.println(h + ":" + m + ":" + s);
				

	}

}

