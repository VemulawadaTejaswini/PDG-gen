
import java.util.Scanner;

public class Main {
	public static void main(String[] args){ 
		Scanner sc=new Scanner(System.in);
		int z = 0;
		int a=sc.nextInt();
		String s=sc.next();
		int b=sc.nextInt();
		if(s=="+")z=a+b;
		else if (s=="-")z=a-b;
		else if(s=="/")z=a/b;
		else if(s=="*")z=a*b;
		else if(s=="?") System.exit(0);
		System.out.println(""+z);
		sc.close();
	}		
}