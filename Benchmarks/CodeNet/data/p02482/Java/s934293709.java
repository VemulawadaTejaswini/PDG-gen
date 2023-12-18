import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;
		try{
			a = Integer.parseInt(scan.next());
			b = Integer.parseInt(scan.next());
			String op;
			if( a > b ){
				op = "a > b";
			}else if( a < b ){
				op = "a < b";
			}else{
				op = "a == b";
			}
			System.out.println(op);
		}catch( IllegalStateException e ){
			System.out.println(e);
		}
		return;
	}
}