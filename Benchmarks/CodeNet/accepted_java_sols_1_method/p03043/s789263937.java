import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      double ans = 0;
      int count = 0;
      for(int i = 1;i<=n;i++){
        int m = i;
        while(m<k){
          m *=2;
          count++;
        }
        ans+=1/Math.pow(2,count)/n;

        count = 0;
      }
      // 出力
      System.out.println(ans);
	}
}