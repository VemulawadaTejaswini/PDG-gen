import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(;;) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			
			String o = Integer.toOctalString(n);    //8進数に変換
			int ol = o.length();

			for(int i = 0; i < ol; i++) {


				char a = o.charAt(i);    //各桁を出す
				int aa = Character.getNumericValue(a);    //aをint型に変換

				if(aa == 4) {
					aa = 5;
				}
				else if(aa >= 5) {
					aa = aa + 2;
				}
				System.out.print(aa);
			}
			System.out.println();
		}
		sc.close();
	}
}
