import java.util.Scanner;

class Main{
    static void hikaku(int a, int b){
	if(a > b)
	    System.out.println("a > b");
	else if(a < b)
	    System.out.println("a < b");
	else
	    System.out.println("a == b");
    }

    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int x = stdIn.nextInt();
	int y = stdIn.nextInt();
	hikaku(x,y);
	
    }
}