import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		String x;
		while(true){	
		
		 a = sc.nextInt();
		 x = sc.next();
		 b = sc.nextInt();
		if(x=="?"){
			break;
		}
		if(x=="+"){
			System.out.println(a+b);
		}
		if(x=="-"){
			System.out.println(a-b);
		}
		if(x=="*"){
			System.out.println(a*b);
	}
		if(x=="/"){
			System.out.println(a/b);
		}
		}
	}
}