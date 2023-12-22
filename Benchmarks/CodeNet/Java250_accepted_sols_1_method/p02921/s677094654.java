
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 天気予報の取得
		String yohou = sc.next();
		//天気の結果取得
		String result = sc.next();
		int count = 0;
		int j = 0;
		String a,b;
		//カウントする。
		for(int i = 0; i < 3; i++) {
			j= i;
			a = yohou.substring(i, i+1);
			b = result.substring(j, j+1);
			//System.out.println("YOHOU"+ i +"文字目：" + a);
			//System.out.println("RESULT"+ i +"文字目：" +b);

			if(a.equals(b)) {
				count++;
			}
		}
		// 出力
		System.out.println(count);
	}

}
