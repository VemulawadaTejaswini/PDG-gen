import java.util.Scanner;

class Main{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	double A = (double)a;
	double B = (double)b;
	
	System.out.printf("%d %d %f", a/b, a%b, A/B);

	}
}
