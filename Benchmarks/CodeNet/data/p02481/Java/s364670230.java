import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String a = scan.next();
	    String b = scan.next();
	    int aa = Integer.parseInt(a);
	    int bb = Integer.parseInt(b);
	    System.out.println(aa * bb + " " + (aa*2 + bb*2));
	}
}