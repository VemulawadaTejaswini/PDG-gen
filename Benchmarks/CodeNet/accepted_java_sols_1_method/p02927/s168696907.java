import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int m = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        String s;
        String ans[] = new String[2];
        int i,j;
      	for(i = 2;i <= m;i++){
          for(j = 22;j <= d;j++){
            s = String.valueOf(j);
            ans = s.split("");
            if(i == Integer.parseInt(ans[0]) * Integer.parseInt(ans[1])
              && Integer.parseInt(ans[0]) >= 2 && Integer.parseInt(ans[1]) >= 2){
             count += 1; 
            }
          }
        }
         System.out.println(count);
    }
}