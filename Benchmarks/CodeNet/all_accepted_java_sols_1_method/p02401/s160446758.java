import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    while(true){
	int a=sc.nextInt();
	char op=sc.next().charAt(0);
	int b=sc.nextInt();
	if(op=='?'){
	    break;
	}
	else if(op=='+'){
	    System.out.println(a+b);
	}
	else if(op=='-'){
	    System.out.println(a-b);
	}
	else if(op=='*'){
	    System.out.println(a*b);
	}
	else if(op=='/'){
	    System.out.println(a/b);
	}
    }
  }
}
