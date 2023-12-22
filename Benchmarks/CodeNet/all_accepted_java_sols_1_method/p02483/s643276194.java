import java.util.*;
public class Main{
    public static void main(String[] args){
	int a,b,c,d;
	Scanner scan = new Scanner(System.in);
	a=scan.nextInt();
	b=scan.nextInt();
	c=scan.nextInt();
	
	if(a>b){
	    d=a;a=b;b=d;
	}
	if(b>c){
	    d=b;b=c;c=d;
	}
	if(a>b){
	    d=a;a=b;b=d;
	}

	System.out.println(a+" "+b+" "+c);
    }
}