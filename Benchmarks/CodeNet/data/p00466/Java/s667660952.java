import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int sum, value;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		while(read()){
			slove();
		}
	}
	static boolean read(){
		sum = sc.nextInt();
		if(sum == 0)
			return false;
		
		for(int i = 0; i < 9; i++){
			value += sc.nextInt();
		}
		//System.out.println(sum);
		//System.out.println(value);
		return true;
	}
	static void slove(){
		System.out.println(sum-value);
	}

}