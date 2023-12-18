import java.util.Scanner;

class Main{
	
	public static void main(String[] args){
		
		int num, i = 1;
		Scanner scan = new Scanner(System.in);
		while((num = scan.nextInt()) != 0){
			System.out.println("Case " + i + ": " + num);
		}
		
	}
	
}