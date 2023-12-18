import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static String before, after;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		read();
		slove();
	}
	static boolean read(){
		before = sc.nextLine();
		return true;
	}
	static void slove(){
		for(int i = 0; i < before.length(); i++){
			after = after + String.valueOf((char)(before.charAt(i)-3));
		}
		for(int i = 4; i < after.length(); i++){
			System.out.print(after.charAt(i));
		}
	}
}