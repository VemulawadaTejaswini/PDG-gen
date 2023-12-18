import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String result = "Yes";
		String[] split = s.split("");
		if (split[0].equals(split[1]) && split[2].equals(split[3]) && !split[0].equals(split[2])) {

		} else if (split[0].equals(split[2]) && split[1].equals(split[3]) && !split[1].equals(split[2])) {

		} else if (split[0].equals(split[3]) && split[1].equals(split[2]) && !split[0].equals(split[1])) {

		} else {
			result = "No";
		}
		System.out.println(result);
	}
}