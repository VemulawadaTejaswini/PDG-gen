import java.util.*;

class Main{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tarou = 0;
		int hanako = 0;

		for (int i = 0; i < n; i++) {
			String t = sc.next();
			String h = sc.next();
			if (t.compareTo(h) > 0)
				tarou += 3;
			else if (t.compareTo(h) < 0)
				hanako += 3;
			else {
				tarou += 1;
				hanako += 1;
			}
		}
		System.out.println(tarou + " " + hanako);
	}
}
