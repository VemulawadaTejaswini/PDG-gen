import java.util.Scanner;


public class Main {

	static String swap(String s, int i, int j) {
		if (i > s.length()-1 || j > s.length()-1) return s;
		StringBuilder sb = new StringBuilder();
		int a, b;
		if (i == j) { return sb.append(s).toString();
		} else if (i < j) { a = i; b = j;
		} else { a = j; b = i; }
		sb.append(s.substring(0, a));
		sb.append(s.charAt(b));
		sb.append(s.substring(a+1, b));
		sb.append(s.charAt(a));
		sb.append(s.substring(b+1));
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = "12345";
		int W = sc.nextInt(), N = sc.nextInt(); sc.nextLine();
		for (int i = 0 ; i < N ; i++) {
			String[] bar = sc.nextLine().split(",");
			str = swap(str, Integer.parseInt(bar[0])-1, Integer.parseInt(bar[1])-1);
		}
		for (int i = 0 ; i < 5 ; i++) System.out.println(str.charAt(i));
	}
}