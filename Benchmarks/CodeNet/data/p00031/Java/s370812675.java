import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String s = Integer.toBinaryString(sc.nextInt());
			String out = "";
			for (int i = 0; i < s.length(); i++)
				if (s.charAt(s.length() - i - 1) == '1')
					out += (int)Math.pow(2, i) + " ";
			System.out.println(out.substring(0,out.length() - 1));
		}

	}

}