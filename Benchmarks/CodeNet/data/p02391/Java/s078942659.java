import java.util.Scanner;

class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int a = nextInt();
		int b = nextInt();
		
		if (a < b) System.out.println("a < b");
		else (a > b) System.out.println("a > b");
		else (a == b) System.out.println("a == b");
	}
}