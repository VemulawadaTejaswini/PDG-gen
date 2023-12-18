import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int num = st.length();
		if ((st.substring(num-1, num)).equals("s")) {
			System.out.println(st + "es");
		} else {
			System.out.println(st + "s");
		}
	}

}
