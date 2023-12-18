import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		char[]a = A.toCharArray();
		char[]b = B.toCharArray();
		
		if(a[0]==b[0]) {
			System.out.print("H");
		}else {
			System.out.print("D");
		}
	}
}
