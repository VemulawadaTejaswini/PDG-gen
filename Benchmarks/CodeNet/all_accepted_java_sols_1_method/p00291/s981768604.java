import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int c1, c5, c10, c50, c100, c500;
		
		c1 = scan.nextInt();
		c5 = scan.nextInt();
		c10 = scan.nextInt();
		c50 = scan.nextInt();
		c100 = scan.nextInt();
		c500 = scan.nextInt();
		
		if(c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500 >= 1000)
			System.out.println(1);
		else System.out.println(0);
	}
}