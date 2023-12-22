import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ans = 7;
		if(S.equals("MON"))
			ans = 6;
		else if(S.equals("TUE"))
			ans = 5;
		else if(S.equals("WED"))
			ans = 4;
		else if(S.equals("THU"))
			ans = 3;
		else if(S.equals("FRI"))
			ans = 2;
		else if(S.equals("SAT"))
			ans = 1;
		System.out.println(ans);

	}

}