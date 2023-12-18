import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(), r = 0, b = 0;
		String S = s.next();
		for (int i = 0; i < N; i++){
			String SS = S.substring(i,i + 1);
			if(SS.equals("R")) r++;
			else b++;
		}
		if (r > b)System.out.println("Yes");
		else System.out.println("No");
	}
}