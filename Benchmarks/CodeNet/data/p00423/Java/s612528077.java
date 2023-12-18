import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int A, B, round;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		read();
		System.out.print(A + " ");
		System.out.println(B);
	}
	static boolean read(){
		round = sc.nextInt();
		for(int i = 0; i < round; i++){
			slove();
		}
		return true;
	}
	static void slove(){
		int getA = 0, getB = 0;
		getA = sc.nextInt();
		getB = sc.nextInt();
		if(getA > getB){
			A += getA + getB;
		}else if(getB > getA){
			B += getB + getA;
		}else{
			A += getA;
			B += getB;
		}
	} 

}