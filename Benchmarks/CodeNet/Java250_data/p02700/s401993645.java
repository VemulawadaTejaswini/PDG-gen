import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean flg = false;
//		高橋体力
		int A = sc.nextInt();
//		高橋攻撃力
		int B = sc.nextInt();
//		青木体力
		int C = sc.nextInt();
//		青木攻撃力
		int D = sc.nextInt();
		while(true) {
			C = C - B;
			if(C <= 0) {
				break;
			}
			A = A - D;			
			if(A <= 0) {
				flg = true;
				break;
			}
		}
		if(flg) {
			System.out.println("No");						
		}else {
			System.out.println("Yes");									
		}
	}
}