import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		String str  = scan.next();

		int num = Integer.parseInt(str);

		System.out.println(num*num*num);
	}
}