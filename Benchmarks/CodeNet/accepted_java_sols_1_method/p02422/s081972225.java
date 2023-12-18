import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String ope = sc.next();
			int start = sc.nextInt();
			int end = sc.nextInt();
			if (ope.equals("replace")) {
				String tmp = sc.next();
				String A = str.substring(0, start);
				String B = str.substring(end+1);
				str = A + tmp + B;
			} else if (ope.equals("reverse")) {
				String A = str.substring(0, start);
				String B = str.substring(end+1);
				String C = str.substring(start, end+1);
				str = A;
				for (int j = 0; j < C.length(); j++) {
					str += "" + C.charAt(C.length()-j-1);
				}
				str += B;
			} else {
				System.out.println(str.substring(start, end+1));
			}
		}
	}
}

