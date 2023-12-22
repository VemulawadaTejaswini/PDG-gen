import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.next();
      	int n = S.length();
        String flag = "Yes";
      for(int i=0;i<n;i++){
        char d = S.charAt(i);
        String x = String.valueOf(d);
        if((x.equals("L") && i%2 == 0)|| (x.equals("R") && i%2 == 1)){
         flag = "No";
        }
      }
        System.out.println(flag);
      
	}
}