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
	
	if((a < b) && (b < c))
	    {
		if(b < c) System.out.println("Yes");
		
	    }
	else System.out.println("No");
    }
}

