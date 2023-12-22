import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int tmp;
		
		if (a > b){
			tmp = a;
			a = b;
			b = tmp;
		}
		
		if (b > c){
			tmp = b;
			b = c;
			c = tmp;
		}
		if (a > b){
			tmp = a;
			a = b;
			b = tmp;
		}
		System.out.println(a + " " + b + " " + c);
		
		
	}
}