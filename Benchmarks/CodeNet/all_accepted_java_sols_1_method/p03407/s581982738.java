import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 硬貨の入力
		int A = sc.nextInt();
      	int B = sc.nextInt();
        int C = sc.nextInt();
      	String result = (A + B >= C) ? "Yes" : "No";
		// 出力
		System.out.println(result);
	}
}