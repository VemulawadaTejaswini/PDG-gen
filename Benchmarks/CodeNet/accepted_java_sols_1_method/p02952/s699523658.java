import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
      
      long cnt = 0;
      String s;
      for(long i = 1; i <= n; i++) {
        s = Long.toString(i);
        if(s.length() % 2 == 1) {
          cnt++;
        }
      }
      System.out.println(cnt);


    }
}
