import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		String sa = "";
		String sb = "";

		for (int i = 0; i < a; i++) {
			sb += b;
		}

		for (int i = 0; i < b; i++) {
			sa += a;
		}
		String res = sa.compareTo(sb) > 0 ? sb : sa;
		System.out.println(res);
	}
}