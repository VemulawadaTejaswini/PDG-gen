import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String v = sc.nextLine();
		String s = sc.nextLine();
		String o = s.substring(0,n/2);
		String t = s.substring(n/2,n);
		if(o.equals(t)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
