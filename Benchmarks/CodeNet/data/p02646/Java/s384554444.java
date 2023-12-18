import java.util.*;
import java.lang.Math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int A=sc.nextInt();
        int V=sc.nextInt();
        int B=sc.nextInt();
        int W=sc.nextInt();
        int T=sc.nextInt();
      if(A==B){
        System.out.println("YES");
      }else{
        if(V>W){
       if(Math.abs(A-B)/Math.abs(V-W)>T){
         System.out.println("NO");
       }else{
         System.out.println("YES");
       }
      }else{
          System.out.println("NO");
        }
      }
}
}