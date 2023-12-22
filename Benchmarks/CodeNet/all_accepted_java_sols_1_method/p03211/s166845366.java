import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
        int n = s.length();
        String run[] = s.split("");
        String x;
        int i,y,z;
        int ans = 1000;
        for(i = 2; i < n; i++){
          x = run[i -2] + run[i - 1] + run[i];
          y = 753 - Integer.parseInt(x);
          z = Integer.parseInt(x) - 753;
            if(y >= 0 && ans > y){
              ans = y;
            }else if(z >= 0 && ans > z){
              ans = z;
            }
          
        }
        
      	System.out.println(ans);
 
    }
}