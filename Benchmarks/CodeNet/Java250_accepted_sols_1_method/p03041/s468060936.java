import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int n = seer.nextInt();
		int k = seer.nextInt();
		char[] s = seer.next().toCharArray();
		s[k-1] -= ('A'-'a');
		System.out.println(new String(s));
	}

}
