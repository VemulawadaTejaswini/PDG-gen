import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int x = 0, y = 0; 
	static String second;
	static int second_ = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		read();	
		slove();
		
	}
	static boolean read(){
		for(int i = 0; i < 4; i++){
			second = sc.next();
			second_ = second_ + Integer.parseInt(second);
		}
		//System.out.println(second_);
		return true;
	}
	static void slove(){
		x = second_/60;
		y = second_ % 60;
		System.out.println(x);
		System.out.println(y);
	}
}