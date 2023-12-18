import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int x;

	if(c<=b){
	    x = c;
	    c = b;
	    b = x;
	}
	if(b<=a){
	    x = b;
	    b = a;
	    a = x;
	}
	if(c<=b){
	    x = c;
	    c = b;
	    b = x;
	}

	System.out.println(a +" "+ b +" " +c);
    }
}