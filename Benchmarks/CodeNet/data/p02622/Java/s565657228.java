import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
		String t = sc.next();
		int num = 0;
      // 出力
		for (int i= 0;i<s.length();i++){
			if(s.charAt(i)!=t.charAt(i)){
				num++;
            }
        }
     	 System.out.println(num);
	}
}