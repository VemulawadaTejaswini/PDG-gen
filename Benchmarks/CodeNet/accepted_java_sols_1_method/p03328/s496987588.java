import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt(),y=scan.nextInt();
		scan.close();
		System.out.print((y-x)*(y-x+1)/2-y);
	}
}