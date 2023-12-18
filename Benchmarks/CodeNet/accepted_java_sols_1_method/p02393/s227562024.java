import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int copy;
		
		if(a > b){
			copy = b;
			b = a;
			a = copy;
		}
		
		if(b > c){
			copy = c;
			c = b;
			b = copy;
		}
		
		if(a > b){
			copy = b;
			b = a;
			a = copy;
		}
		
		System.out.println(a + " " + b + " " + c);
		sc.close();
	}
}
