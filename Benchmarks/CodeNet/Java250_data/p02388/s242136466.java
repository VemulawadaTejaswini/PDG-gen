import java.util.Scanner;
public class Main {
	void scanX(){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		System.out.println(x*x*x);
	}
	public static void main(String args[]){
		Main m1 = new Main();
		m1.scanX();
	}

}