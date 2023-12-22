import java.util.Scanner;
public class Main {
	void circle(){
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		System.out.println(String.format("%.9f", Math.PI*(double)(r*r)) + " " + String.format("%.9f", Math.PI * (double)(r*2)));
	}
	public static void main(String args[]){
		Main m = new Main();
		m.circle();
	}
}