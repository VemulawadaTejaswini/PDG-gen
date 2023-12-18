import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;
		String temp;
		try{
			a = Integer.parseInt(scan.next());
			b = Integer.parseInt(scan.next());
			String op;
			if( a > b ){
				op = ">";
			}else if( a < b ){
				op = "<";
			}else{
				op = "=";
			}
			System.out.println((a) + " " + op + " " + (b));
		}catch( IllegalStateException e ){
			System.out.println(e);
		}
		return;
	}
}