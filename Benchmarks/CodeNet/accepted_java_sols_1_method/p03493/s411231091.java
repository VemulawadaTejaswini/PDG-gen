import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
      	int sum = 0;
      	if("1".equals(s.substring(0,1))) sum +=1;        
        if("1".equals(s.substring(1,2))) sum +=1;
        if("1".equals(s.substring(2,3))) sum +=1;
      	
		// 出力
		System.out.println(sum);
	}
}