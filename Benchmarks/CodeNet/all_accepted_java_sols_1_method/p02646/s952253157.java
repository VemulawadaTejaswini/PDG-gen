import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        long a = sc.nextLong();
        long v = sc.nextLong();
        long b = sc.nextLong();
        long w = sc.nextLong();
        long t = sc.nextLong();
        long hole = Math.abs(a-b);
        long amax = v * t;
        long bmax = w * t;
        long tag = amax - bmax;
         if(hole > tag){
            System.out.println("NO");
            return;
          }
        
        
        System.out.println("YES");
    }
}