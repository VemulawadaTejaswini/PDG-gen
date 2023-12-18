import java.util.Scanner;
public class Main {
	int d,k;
	public void solve() {
	Scanner sc = new Scanner(System.in);
	String a = sc.next();

	if( Character.isUpperCase( a.charAt( 0 ) ) ) {
	    System.out.println("A");
	}else {
	    System.out.println("a");
	}
	}
	public static void main(String[] args) {
		new Main().solve();
	
	}
}
