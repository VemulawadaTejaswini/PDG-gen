import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();

		// 計算
		int cnt = 0;
		for(int i = 1; i < n + 1; i++){
		    String s = Integer.toString(i);
		    if(s.length()%2 == 1){
		        cnt++;
		    }
		}

		// 出力
        System.out.println(cnt);
		
	}
}
