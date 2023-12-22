public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		while(true) {
			String str1 = in.next();
			String str2 = in.next();
			String str3 = in.next();
			int m = java.lang.Integer.parseInt(str1);
			int f = java.lang.Integer.parseInt(str2);
			int r = java.lang.Integer.parseInt(str3);
			if(m == -1 && f == -1 && r == -1) break;
			if(m == -1 || f == -1)
				System.out.println("F");
			else if (m + f >= 80)
				System.out.println("A");
			else if (m + f >= 65)
				System.out.println("B");
			else if (m + f >= 50)
				System.out.println("C");
			else if (m + f >= 30) {
				if (r >= 50)
					System.out.println("C");
				else
					System.out.println("D");
			}
			else
				System.out.println("F");
		}
	}
}