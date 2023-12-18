import java.util.Scanner;

public class Main{

    static char[] expr;
    static int now;

    private static int expression(){
	int res=term();
	while(true){
	    char c=expr[now++];
	    if(c=='+')res+=term();
	    else if(c=='-')res-=term();
	    else break;
	}
	return res;
    }

    private static int term(){
	int res=fact();
	while(true){
	    char c=expr[now++];
	    if(c=='*')res*=fact();
	    else if(c=='/')res/=fact();
	    else break;
	}
	now--;
	return res;
    }
    
    static int fact(){
	char c=expr[now++];
	if(c=='(')return expression();
	if(c=='-')return -fact();
	if(c=='+')return fact();
	int x=c-'0';
	while(true){
	    c=expr[now++];
	    if(Character.isDigit(c)){
		x*=10;
		x+=c-'0';
	    }
	    else break;
	}
	now--;
	return x;
    }

    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t--!=0){
	    expr=sc.next().toCharArray();
	    now=0;
	    System.out.println(expression());
	}
    }
    
}