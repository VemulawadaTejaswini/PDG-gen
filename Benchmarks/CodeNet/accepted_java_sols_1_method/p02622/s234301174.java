import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		char[] d = a.toCharArray();
		char[] e = b.toCharArray();
		int r= 0;
		for(int i = 0;i < d.length;i++) {
			if(!(d[i]==(e[i]))) {
				r++;
			}
		}
		System.out.println(r);
		sc.close();
	}
}
