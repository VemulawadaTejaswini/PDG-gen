import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] c = new String[3];
		for(int i = 0;i < c.length;++i)
			c[i] = sc.next();
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < c.length;++i)
			sb.append(c[i].charAt(i));
		System.out.println(sb.toString());
	}
}
