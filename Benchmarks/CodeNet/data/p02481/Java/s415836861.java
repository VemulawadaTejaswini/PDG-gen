import java.util.Scanner;
class Main{
	private static Scanner scan=new Scanner(System.in);
	public static void main(String args[]){
		int n1,n2;
		n1=scan.nextInt();
		n2=scan.nextInt();
		System.out.println(n1*n2+" "+(n1+n2)*2);
	}
}