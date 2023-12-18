import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		String s = sc.next();
		String[] S = s.split("");
		int cnt = 0;

		for(String str:S){
			if(str.equals("R"))cnt++;
			else cnt--;
		}

		// 出力
		System.out.println(cnt>0?"Yes":"No");
	}
}