import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        String[] sList = ("" + n).split("");
        int sum = 0;
        for(int i = 0; i < sList.length; i++) {
          sum += Integer.parseInt(sList[i]);
        }
    
		// 出力
		System.out.println(n % sum == 0 ? "Yes" : "No");
	}
}