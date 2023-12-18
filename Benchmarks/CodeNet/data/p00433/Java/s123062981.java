import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	/**
	 * @param args
	 */
	static int sum_A, sum_B, infomation, math, science, English;
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		read();
		slove();
	}
	static boolean read(){
		infomation = sc.nextInt();
		math = sc.nextInt();
		science = sc.nextInt();
		English = sc.nextInt();
		
		sum_A = infomation+math+science+English;

		infomation = sc.nextInt();
		math = sc.nextInt();
		science = sc.nextInt();
		English = sc.nextInt();

		sum_B = infomation+math+science+English;
		
		return true;
	}
	static void slove(){
		int max = Math.max(sum_A, sum_B);
		System.out.println(max);
	}

}