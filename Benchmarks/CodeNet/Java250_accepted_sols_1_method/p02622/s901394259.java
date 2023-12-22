import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

		 String a = s.next();
		 String b = s.next();

		 String[] strArrayA = a.split("");
		 String[] strArrayB = b.split("");

		 int cnt = 0;

		 for(int i=0; i<a.length(); i++) {
			 String strA = String.valueOf(a.charAt(i));
			 String strB = String.valueOf(b.charAt(i));
			 if(strA.equals(strB) == false) {
				 cnt++;
			 }
		 }

		 System.out.println(cnt);
	}

}