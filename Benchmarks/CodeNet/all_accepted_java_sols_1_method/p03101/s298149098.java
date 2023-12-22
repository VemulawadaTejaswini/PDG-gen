import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
        int w = sc.nextInt();
    
		// 出力
		System.out.println(H * W - (H * w + W * h ) + h * w);
	}
}