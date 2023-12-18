import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
    	while(true){
	    	int a=s.nextInt();
	    	char op=s.next().charAt(0);
	    	int b=s.nextInt();
	    	if(op=='?')break;
	    	else if(op=='+')System.out.println(a+b);
	    	else if(op=='-')System.out.println(a-b);
	    	else if(op=='/')System.out.println(a/b);
	    	else if(op=='*')System.out.println(a*b);
	    }
    }
}
//by TTTMongolia 11/05/2012