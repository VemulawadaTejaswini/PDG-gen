import java.util.Scanner;

class Main{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		String str[] = scan.nextLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		System.out.println(a*b);
	}
}