import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,n=0;
		String num;
		while(true){
			a=sc.nextInt();
			b=sc.nextInt();
			num=String.valueOf(a+b);	
			n=num.length();
			System.out.println(n);
		}
	}
}