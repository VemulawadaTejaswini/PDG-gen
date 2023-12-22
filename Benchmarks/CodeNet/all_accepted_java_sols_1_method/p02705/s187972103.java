import java.util.Scanner;
 
public class Main{
 
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		double result = R*2*3.1415;
		scan.close();
		System.out.println(result);
	}
}