import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
        String ac[] = a.split("");
		String b = sc.next(); 
        String bc[] = b.split("");
        int ans = 0;
        int count = 0;
      
        for(int i = 0;i < a.length() - (b.length() - 1);i++){
          for(int j = 0; j < b.length(); j ++){
            if(ac[i + j].equals(bc[j])){
              count += 1;
            }
          }
          if(ans < count){
            ans = count;
          }
          count = 0;
        }
      	System.out.println(b.length() - ans);
 
    }
}