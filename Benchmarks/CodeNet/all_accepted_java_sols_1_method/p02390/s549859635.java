import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt(); // 46979秒
        int c = a / 3600; // 13時間
        int d = a - c * 3600;
        int e = d / 60;
        int f = d - e * 60;
        System.out.println(c + ":" + e + ":" + f);
        
	}
}
