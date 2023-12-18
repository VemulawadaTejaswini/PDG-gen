import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      	int n = sc.nextInt();
      	String s = sc.next();
        String t = sc.next();
      
        String a[] = s.split("");
        String b[] = t.split("");
        String ans = "";
        for(int i = 0;i < n;i++){
          ans += a[i] + b[i];
        }
      
        
        System.out.println(ans);
      
    }
}