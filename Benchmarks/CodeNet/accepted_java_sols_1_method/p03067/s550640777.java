
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());

		if((a>c && c>b) || (a<c && c<b)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
