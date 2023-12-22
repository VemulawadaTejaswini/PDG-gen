import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int x1 = (int)(n / 1.08);
		int n1 = (int)(x1 * 1.08);
		int x2 = x1 + 1;
		int n2 = (int)(x2 * 1.08);
		
		if( n == n1 ){
			System.out.println(x1);
		} else if( n == n2 ){
			System.out.println(x2);
		} else{
			System.out.println(":(");
		}
	}
}