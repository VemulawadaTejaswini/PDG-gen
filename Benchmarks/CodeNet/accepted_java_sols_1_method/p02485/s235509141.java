
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String a = sc.next();
			if(a.equals("0"))break;
			char[] b = a.toCharArray();
			int w = 0;
			for (int i = 0; i < b.length; i++) {
				w += Character.getNumericValue(b[i]);
			}
			System.out.println(w);
		}
	}

}