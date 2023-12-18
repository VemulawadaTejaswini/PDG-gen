import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int t = 0;
		
		if(a > b){
		t = a;
		a = b;
		b = t;
		}
		if(b > c){
		t = b;
		b = c;
		c = t;
		}
		if(a > b){
		t = a;
		a = b;
		b = t;
		}
		
		System.out.println(a+" "+b+" "+c);
	}
}