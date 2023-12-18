import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String temp;
		double r;
		try{
			temp = scan.next();
			r = Double.parseDouble(temp);
		}catch( IllegalStateException e ){
			System.out.println(e);
		}
		System.out.printf("%7.5f %7.5f", Math.PI * r * r, 2 * Math.PI * r);
		return;
	}
}