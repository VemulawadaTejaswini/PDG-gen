import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a,b;
		double s;
		
		a = scan.nextInt();
		b = scan.nextInt();
		s = (double)(a*b)/3.305785;
		s = Math.ceil(s*1000000)/1000000;
		System.out.println(s);
	}
}