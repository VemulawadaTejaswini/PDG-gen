import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		in.close();
		if(X == 3 || X == 5 || X == 7) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}