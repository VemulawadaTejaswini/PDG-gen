import java.util.*;


public class Main{
	public static void main(String[] args){

		// 入力値取得
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double po = Math.pow(r, 2);
		int d = 3 * (int)po;
		System.out.println(d);
	}
}
