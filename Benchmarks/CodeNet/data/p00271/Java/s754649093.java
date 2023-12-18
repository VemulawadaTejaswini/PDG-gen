import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		for(int i = 1; i < 7; i++){
			a = scan.nextInt();
			b = scan.nextInt();
			
			System.out.println(a-b);
		}
	}
}