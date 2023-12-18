import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int w = sc.nextInt();
		int size_S = S.length();
		for(int i = 0; i < size_S ; i += w) {
			System.out.print(S.charAt(i));
		}

	}

}