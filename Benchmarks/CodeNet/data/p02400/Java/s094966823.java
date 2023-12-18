import java.util.Scanner;

class Main{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	double pi = Math.PI;
	int r = scan.nextInt();
	System.out.println(pi * r * r + " " + 2 * pi * r);
	}
}