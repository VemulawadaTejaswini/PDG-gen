import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String a = sc.next();
			String b = sc.next();

			boolean aflg = "H".equals(a);
			boolean bflg = "H".equals(b);


			if(aflg){
				System.out.println(bflg?"H":"D");
			} else {
				System.out.println(!bflg?"H":"D");
			}
		}
	}
}