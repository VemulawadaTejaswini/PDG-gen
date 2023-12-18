import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
        int h1 = Integer.parseInt(str);
        str = sc.next();
        int m1 = Integer.parseInt(str);
        str = sc.next();
        int h2 = Integer.parseInt(str);
        str = sc.next();
        int m2 = Integer.parseInt(str);
        str = sc.next();
        int k = Integer.parseInt(str);

        h2 -= h1;
        h2 *= 60;
        h2 += m1;
        h2 -= m2;
        h2 -= k;
        sc.close();
        System.out.println(h2);
	}
}