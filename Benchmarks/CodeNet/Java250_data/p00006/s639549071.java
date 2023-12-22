import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static String line;
	public static void main(String[] args) {
		read();
		slove();
	}
	static  boolean read(){
		line = sc.nextLine();
		return true;
	}
	static void slove(){
		String line_ = new StringBuffer(line).reverse().toString();
		System.out.println(line_);
	}
}