import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int S;
		int h, m ,s;
		
		S = scan.nextInt();
		
		h = S / 3600;
		m = S % 3600 / 60;
		s = S % 3600 % 60;	
		System.out.println(h + ":" + m + ":" + s);
	}

}