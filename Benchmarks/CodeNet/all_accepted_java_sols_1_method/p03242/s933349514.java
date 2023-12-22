import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		char[] val = scn.nextLine().trim().toCharArray();
		String out = "";
		for (char v : val) {
			out = out + "" + (v == '1' ? '9' : '1');
		}
		System.out.println(out);
	}
}