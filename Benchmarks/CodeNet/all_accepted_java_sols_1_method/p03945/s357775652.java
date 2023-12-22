import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int len = s.length();

		int ans = 0;
		for (int i = 1;i  < len ; ++i){
			if (s.charAt(i-1) != s.charAt(i))++ans;
		}

		System.out.print(ans);

	}
}
//end
