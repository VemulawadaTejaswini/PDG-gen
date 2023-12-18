import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x = sc.nextInt();
        int n = sc.nextInt();
        int check = n;
        int z= 999;
        int p[] = new int[n];
        int ans = 100;
        HashSet hs = new HashSet();
        for(int i = 0; i < n;i++){
          hs.add(sc.nextInt());
        }
        
        hs.add(x);
        if(hs.size() != n){
          System.out.println(x);
          System.exit(0);
        }
        for(int i = -100; i <= 200;i++){
          hs.add(i);
          if(hs.size() != check){
            if(Math.abs(x - i) < ans){
              ans = x - i;
              z = i;
            }
            check++;
          }
        }
        

        System.out.println(z);
    }
}