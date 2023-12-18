
import java.util.Scanner;
public class Main{


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		while(a!=0 || b!=0){
			
			System.out.println(b>a?a+" " +b:b+" "+a);
			a=sc.nextInt();
			b=sc.nextInt();
		}
		
	}

}