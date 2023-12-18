import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String st = scan.next();
	int a = Integer.parseInt(st);
	st = scan.next();
	int b = Integer.parseInt(st);
	st = scan.next();
	int c = Integer.parseInt(st);
	int t;

	if(a > b)
	    {
		t = b;
		b = a;
		a = t;
	    }
	if(b > c)
	    {
		t = c;
		c = b;
		b = t;
	    }
	if(a > b)
	    {
		t = b;
		b = a;
		a = t;
	    }
	System.out.println(a + " " + b + " " + c);
    }
}

