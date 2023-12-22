import java.util.Scanner;

/**
 *
 */

/**
 * @author bluen
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();

		sc.close();

		if(A==B) {
			System.out.println(A+B);
		}else if(A>B) {
			System.out.println(A+(A-1));
		}else if(A<B) {
			System.out.println(B+(B-1));
		}

	}
}