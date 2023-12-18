import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		char[] o = sc.next().toCharArray();
		char[] e = sc.next().toCharArray();
		sc.close();
		if( o.length == e.length) {
			for(int i = 0; i < o.length; i++) {
				System.out.print(o[i] + "" + e[i]);
			}
			System.out.println("");
		}else {
			for(int i = 0; i < e.length; i++) {
				System.out.print(o[i] + "" + e[i]);
			}
			System.out.println(o[o.length-1]);
		}
	}
}