import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,c,d;
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		do{
		    c=c-b;
		  //   System.out.println("c" + c);
		    if(c<=0)
		        break;
		    a=a-d;
		  //  System.out.println("a" + a);
		    if(a<=0)
		        break;
		}while(c>0 && a>0);
		if(c<=0)
		     System.out.println("Yes");
		 else
		    System.out.println("No");
		input.close();
	}
}