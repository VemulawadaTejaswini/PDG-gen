import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	
	int a = sca.nextInt();
	int b = sca.nextInt();
	int c = sca.nextInt();
	
	boolean a_b = (a == 5 || a == 7);
	boolean b_b = (b == 5 || b == 7);
	boolean c_b = (c == 5 || c == 7);
	
	String answer = "YES";
	
	if(a_b && b_b && c_b) {
		if(a + b + c == 17) {
			answer = "YES";
		}
		else {
			answer = "NO";
		}
	}
	else {
		answer = "NO";
	}
	
	System.out.println(answer);
	sca.close();
	}
}