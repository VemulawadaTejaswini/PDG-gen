import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int A, B, round;
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
		round = sc.nextInt();
		if(round == 0)
			return false;
		return true;
	}
	static void slove(){
		int getA = 0, getB = 0, A = 0, B = 0;
		for(int i = 0; i < round; i++){
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
		System.out.print(A + " ");
		System.out.println(B);
	} 

}