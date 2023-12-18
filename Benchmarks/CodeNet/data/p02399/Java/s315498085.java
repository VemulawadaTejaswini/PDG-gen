import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		float A=(float)a;
		float B=(float)b;
		System.out.println((a/b)+" "+(a%b)+" "+(A/B));
		
	}
}
