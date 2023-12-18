import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	    Scanner std = new Scanner(System.in);
	    int a = Integer.parseInt(std.next());
	    int b = Integer.parseInt(std.next());
	    int c = Integer.parseInt(std.next());
	    int temp = 0;
	    if(a>b){temp=a;a=b;b=temp;}
	    if(b>c){temp=b;b=c;c=temp;}
	    if(a>b){temp=a;a=b;b=temp;}
	    System.out.println(a+" "+b+" "+c);
	}
}