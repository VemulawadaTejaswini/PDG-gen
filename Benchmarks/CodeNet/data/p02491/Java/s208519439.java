import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.B();
	}
		
	void B(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		String d = Integer.toString(a/b);
		
		String r = Integer.toString(a%b);
		
		String f = String.format("%f",(double)a/(double)b);
		
		System.out.println(d + " " + r + " " + f);

	}
}