import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int r = 0;
		int t = 0;
		String str = "";
		//判定
		for(int i = 1; i <= 9; i++){
			t = n / i;
			r = n % i;
			 if(t <= 9 && r == 0){
				 str = "Yes";
				 break;
			 }
		}
		//出力文字決定
		if(str.isEmpty()){
			str = "No";
		}
		System.out.println(str);
	}
}
