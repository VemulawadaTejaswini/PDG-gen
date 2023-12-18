import java.util.Scanner;

public class Min {
	public static void main(String[] args){ 
		Scanner sc=new Scanner(System.in);
		int z = 0;
		while(true){
			int a=sc.nextInt();
			String s=sc.next();
			int b=sc.nextInt();
			if("?".equals(s))break;
			else if ("-".equals(s))z=a-b;
			else if("/".equals(s))z=a/b;
			else if("*".equals(s))z=a*b;
			else if("+".equals(s))z=a+b;
			System.out.println(""+z);
		}
		sc.close();
		System.exit(0);
	}		