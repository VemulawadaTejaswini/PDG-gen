import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();
	double x = (a+b)/2.0;

	System.out.println((int)Math.ceil(x));
    }
}
	
