import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	String s = sca.next();
	String t = sca.next();
	int a = sca.nextInt();
	int b = sca.nextInt();
	String u = sca.next();

	if(u.equals(s)) {
		a--;
	}
	else {
		b--;
	}

	System.out.print(a);
	System.out.print(" ");
	System.out.println(b);

	// 後始末
	sca.close();
	}
}