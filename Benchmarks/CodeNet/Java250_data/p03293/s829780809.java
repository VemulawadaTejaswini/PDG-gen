import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		String tmp = s;
		boolean match = false;

		for (int i = 0; i<s.length(); i++){
			tmp = Rotate(tmp);
			if (tmp.equals(t)){
				match = true;
				break;
			}
		}
		if (match){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static String Rotate(String source){
		String ret = source.substring(source.length() - 1) + source.substring(0, source.length()-1);
		return ret;
	}
}