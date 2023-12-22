import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int x;
	
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		val = val * val * val;
		System.out.println(val);
	}
}