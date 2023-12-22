import java.util.Scanner;
public class Main {
	void rect(){
		int a,b;
		Scanner s1 = new Scanner(System.in);
		a = s1.nextInt();
		b = s1.nextInt();
		System.out.println(a*b + " " + (2*a+2*b));
	}
	public static void main(String args[]){
		Main m1 = new Main();
		m1.rect();
	}
}