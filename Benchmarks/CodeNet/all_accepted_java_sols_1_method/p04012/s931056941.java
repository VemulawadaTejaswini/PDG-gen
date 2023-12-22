import java.util.Scanner;
import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());	//入力された文字列を用意
		String ans="Yes";	//strの初期設定

		for(int i=0;i<sb.length();i++){
			int num=0;
			for(int j=0;j<sb.length();j++){
				//文字が一致した回数numをカウント
				if(sb.charAt(i)==sb.charAt(j)) num++;
			}
			//numが奇数になったらansをNoに変更
			if(num%2==1) ans="No";
			//ansがNoになったらfor文を抜ける
			if(ans.equals("No")) break;
		}

		//結果を出力
		System.out.println(ans);
	}
} 