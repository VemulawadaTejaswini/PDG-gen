import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		// 計算
		String result = "No";
		for(int i = -120; i <= 120; i++){
		    for(int j = -120; j <= 120; j++){
		        if(pow(i, 5) - pow(j, 5) == x){
		            System.out.println(i + " " + j);
		            return;
		        }
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
