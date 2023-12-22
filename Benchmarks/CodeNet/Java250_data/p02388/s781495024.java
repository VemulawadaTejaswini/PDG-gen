import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		print(n*n*n);
	}
	private static void print(int x){
		System.out.println(x);
	}
}
