import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a >=1 && b>=1 && a<=100 && b<=100){
			System.out.println(a*b + " "+2*(a+b));
		}
	}
}
