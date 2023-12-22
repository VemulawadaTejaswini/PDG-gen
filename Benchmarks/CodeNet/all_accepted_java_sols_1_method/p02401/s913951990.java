import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		while(true){
		  int a=sc.nextInt();
		  String c=sc.next();
		  int b=sc.nextInt();
	 	  if(c.equals("+")){System.out.println(a+b);}
	      if(c.equals("-")){System.out.println(a-b);}
		  if(c.equals("*")){System.out.println(a*b);}
		  if(c.equals("/")){System.out.println(a/b);}
		  else if(c.equals("?")){break;}
		}
	}
}
