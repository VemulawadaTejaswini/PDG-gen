import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		while(true){	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String x = sc.next();
		int b = sc.nextInt();
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