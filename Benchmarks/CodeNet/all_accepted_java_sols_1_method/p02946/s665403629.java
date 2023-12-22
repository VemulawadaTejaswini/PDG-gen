import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int k = sc.nextInt();
		int x = sc.nextInt();
        
        int point = x - k + 1;
        int wide = (2 * k) - 1;
        String ans = "";
        for (int i =  x - k + 1; i < wide + point; i++) {
          ans += i;
          ans += " ";
        }
    
		// 出力
		System.out.println(ans);
	}
}