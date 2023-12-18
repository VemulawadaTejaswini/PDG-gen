import java.util.Scanner;


public class Main {

	static String swap(String s, int i, int j) {
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

		int W = sc.nextInt(), N = sc.nextInt(); sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < W ; i++) sb.append((char) (49+i));
		String str = sb.toString();
		for (int i = 0 ; i < N ; i++) {
			String[] bar = sc.nextLine().split(",");
			str = swap(str, Integer.parseInt(bar[0])-1, Integer.parseInt(bar[1])-1);
		}
		for (int i = 0 ; i < 5 ; i++) System.out.println(((int) str.charAt(i))-48);
	}
}