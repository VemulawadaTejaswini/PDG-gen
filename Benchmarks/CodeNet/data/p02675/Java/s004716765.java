import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int x=n%10;
		if(x==2 || x==4 || x==5 || x==7 || x==9) System.out.println("hon");
		else if(x==0 || x==1 ||x==6|| x==8)System.out.println("pon");
		else System.out.println("bon");
		
	}

}