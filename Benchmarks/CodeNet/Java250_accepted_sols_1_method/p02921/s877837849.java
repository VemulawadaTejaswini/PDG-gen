import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] N1 = new String[3];
      	int ans = 0;
      	sc.useDelimiter("");
      	N1[0] = sc.next();
      	N1[1] = sc.next();
      	N1[2] = sc.next();
	    sc.next();
		for (int i = 0; i < 3; i++) {
			if (N1[i].equals(sc.next())) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}