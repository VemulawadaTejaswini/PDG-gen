import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int a = scan.nextInt();
    	int b = scan.nextInt();
    	int c = scan.nextInt();

    	if(a > b){
    		int buf = b;
    		b = a;
    		a = buf;
    	}
    	if(b > c){
    		int buf = c;
    		c = b;
    		b = buf;
    	}
    	if(a > b){
    		int buf = b;
    		b = a;
    		a = buf;
    	}

    	System.out.printf("%d %d %d\n", a,b,c);

    }
}