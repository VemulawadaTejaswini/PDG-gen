import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		
		char[] a = n.toCharArray();
		
		if(a[2] == a[3] && a[4] == a[5]) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

}
