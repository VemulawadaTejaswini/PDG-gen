import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		//入力した文字列をcharにして格納
		char[] a = sc.next().toCharArray();
		int n = a.length;
		
		//回答を入れる箱
		String ans = "";
		
		//ケース分け
		for(int i = 0 ; i < n ; i++){
			switch(a[i]){
				case '0' :
					ans = ans + "0";
					break;
				case '1' :
					ans = ans + "1";
					break;
				case 'B' :
					if(ans.length() != 0){
						ans = ans.substring(0,ans.length()-1);
						break;
					} else {
					break;
					}
			}
		}
			
		//結果の出力
		System.out.println(ans);
	}

}