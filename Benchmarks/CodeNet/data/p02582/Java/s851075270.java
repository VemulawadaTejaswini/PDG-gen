import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ans = 0;
		for(int i = 0; i < 3; i++)
			if(S.charAt(i) == 'R')
				ans++;
		if(S.equals("RSR"))
			ans = 1;
		System.out.println(ans);
	}

}
