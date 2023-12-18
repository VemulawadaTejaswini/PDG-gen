import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int tarou = 0;  //太郎の得点
		int hanako = 0;  //花子の得点
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String taro = sc.next();
			String hana = sc.next();

			if(taro.equals(hana)) {  //同じ単語の場合
				tarou++;
				hanako++;
			}
			else {  //別な単語の場合、配列に変換し先頭から1文字ずつ比較
				char ta[] = taro.toCharArray();
				char ha[] = hana.toCharArray();
				boolean frag = false;  //for文をbreakで出たのかどうか判定
				for(int j = 0; j < Math.min(taro.length(), hana.length()); j++) {
					if(ta[j] > ha[j]) {
						tarou += 3;
						frag = true;
						break;
					}
					else if(ta[j] < ha[j]) {
						hanako += 3;
						frag = true;
						break;
					}
				}
				if(frag == false) {  //breakで出ていない場合
					if(taro.length() > hana.length()) tarou += 3;  //長さ比較で長いほうが+3
					else hanako += 3;
				}
			}
		}

		System.out.println(tarou + " " + hanako);
	}

}

