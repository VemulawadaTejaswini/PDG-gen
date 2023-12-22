import java.util.*;
import java.lang.*;
  
public class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int i=0,count=0;
    int a=stdIn.nextInt();
    char c=stdIn.next().charAt(0);
    int b=stdIn.nextInt();
    while (c!='?'){
	if (c=='+'){
	    System.out.println(a+b);
	}
	if (c=='-'){
	    System.out.println(a-b);
	}
	if (c=='*'){
	    System.out.println(a*b);
	}
	if (c=='/'){
	    System.out.println(a/b);
	}
	a=stdIn.nextInt();
	c=stdIn.next().charAt(0);
	b=stdIn.nextInt();
    }
  }
}

