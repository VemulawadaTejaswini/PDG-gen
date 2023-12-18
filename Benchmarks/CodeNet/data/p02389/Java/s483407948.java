import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,c,s;
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		s=2*(a+b);
		System.out.println(c);
		System.out.println(s);
		sc.close();
	}
}

