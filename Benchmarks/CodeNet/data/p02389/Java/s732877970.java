import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int s=a*b;
		int l=2*(a+b);
		
		System.out.println( s +""+ l );
	}
}
