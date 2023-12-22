import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int ans = 0;
			String s = sc.next().toUpperCase();
			while (true) {
				String[] ar = sc.nextLine().split(" ",0);
				if (ar[0].equals("END_OF_TEXT")) break;

				for (int i=0; i<ar.length; i++) {
					if (ar[i].toUpperCase().equals(s)) ans++;
				}
			}
		System.out.println(ans);
		
	}
}
