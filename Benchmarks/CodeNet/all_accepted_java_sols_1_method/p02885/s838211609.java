import java.util.*;
/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		if((A-2*B)>0){
			System.out.println(A-2*B);
		}else{
			System.out.println(0);
		}
		sc.close();
	}
};