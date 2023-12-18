import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int Wdays = sc.nextInt();
		int jp = sc.nextInt();
		int mp = sc.nextInt();
		int mjp = sc.nextInt();
		int mmp = sc.nextInt();
		int dayscnt=0;
		for(int i = 1; i <= Wdays; i++){
			jp -= mjp;
			mp -= mmp;
			dayscnt = i;
			if(jp <= 0 && mp <= 0){
				Wdays -= dayscnt;
				System.out.println(Wdays);
				break;
			}
		}
		
	}
}