import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String st = scan.next();
	int w = Integer.parseInt(st);
	st = scan.next();
	int h = Integer.parseInt(st);
	st = scan.next();
	int x = Integer.parseInt(st);
	st = scan.next();
	int y = Integer.parseInt(st);
	st = scan.next();
	int r = Integer.parseInt(st);
	
	if((x - r) < 0 || (y - r) < 0 || (x + r) > w || (y + r) > h) 
	    {
		System.out.println("No");
	    }
	else System.out.println("Yes");
    }
}

