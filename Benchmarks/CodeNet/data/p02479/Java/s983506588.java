import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.A();
	}
	
	void A(){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println(Math.PI*r*r + " " + Math.PI*r*2);
	}
}