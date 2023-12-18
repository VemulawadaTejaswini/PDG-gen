import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] handout = new int[31];
	static int[] source = new int[29];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		read();
		slove();
	}
	static boolean read(){
		for(int i = 1; i <= 28; i++){
			source[i] = sc.nextInt();
		}
		return true;
	}
	static void slove(){
		for(int i = 1; i<=30; i++){
			handout[i] = i;
		}
		for(int i = 1; i <= 30 ;i++){
			for(int j = 1; j <=28 ; j++){
				if(handout[i] == source[j])
					handout[i] = 0;
				
			}
			if(handout[i] != 0)
				System.out.println(handout[i]);
		}
		
	}
}