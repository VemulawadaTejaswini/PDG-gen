import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int tate, yoko;
		tate = scan.nextInt();
		yoko = scan.nextInt();
		
		System.out.print(tate * yoko + " ");
		System.out.println((tate + yoko) * 2);
	}
}