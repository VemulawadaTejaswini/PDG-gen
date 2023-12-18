import java.util.Scanner;

public class Main {
	void ab(){
		int a,b,d,r;
		float f;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		d = a/b;
		r = a%b;
		f = (float)a/b;
		System.out.println(d + " " + r + " " + f);
	}
	public static void main(String args[]){
		Main m = new Main();
		m.ab();
	}
}