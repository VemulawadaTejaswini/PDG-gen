import java.util.*;

public class Main{
	public static void main(String[] artgs){
		int res = 0;
		String s = new Scanner(System.in).nextLine();
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) == '+') res++;
			else res--;
		}

		System.out.println(res);
	}
}
