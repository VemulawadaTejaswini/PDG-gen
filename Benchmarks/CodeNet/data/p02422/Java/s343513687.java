import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int q = sc.nextInt();
		
		for (int i = 0; i < q; i++) {
			String com = sc.next();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			
			switch (com) {
				case "print":
					System.out.println(str.substring(c1,c2+1));
					break;
				case "reverse":
					String s = "";
					for (int j = c2; j >= c1; j--)
						s += str.charAt(j);
					str = str.substring(0,c1) + s + str.substring(c2+1);
					break;
				case "replace":
					String p =sc.next();
					str = str.substring(0,c1) + p + str.substring(c2+1);
			}
		}
	}
}
