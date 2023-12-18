import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
		if(a==b&&b==c) {
			System.out.println(1);
		}
		if(a!=b&&b!=c&&c==a) {
			System.out.println(2);
		}
		if(a!=b&&b!=c&&c!=a) {
			System.out.println(3);
		}
		if(a!=b&&b==c&&c!=a) {
			System.out.println(2);
		}
		if(a==b&&b!=c&&c!=a) {
			System.out.println(2);
		}
		
	}
	}