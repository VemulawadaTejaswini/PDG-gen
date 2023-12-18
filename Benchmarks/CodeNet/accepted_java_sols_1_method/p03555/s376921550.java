import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String row1 = sc.next();
		String row2 = sc.next();
		StringBuffer sb = new StringBuffer(row2);
		row2 = sb.reverse().toString();
		if(row1.equals(row2)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();
	}

}
