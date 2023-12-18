import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String sch = sc.nextLine();
		int n = Integer.parseInt(sc.nextLine());
		String[] rings = inputRing(n);

		searchRing(sch, n, rings);
	}

	private static void searchRing(String sch, int n, String[] rings) {
		int cnt = 0;

			for (int i = 0; i < n; i++) {

				if ( rings[i].contains(sch) ) {
					cnt++;
				}


			}

			System.out.println(cnt);


	}

	private static String[] inputRing(int n) {
		String[] rings = new String[n];
		StringBuilder sb = new StringBuilder();
		String str = "";

			for (int i = 0; i < n; i++) {
				str = sc.nextLine();
				sb.append(str).append(str);

				rings[i] = sb.toString();
				sb.delete(0, sb.length());
			}

		return rings;
	}

}
