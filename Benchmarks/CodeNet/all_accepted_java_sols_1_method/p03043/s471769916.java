import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t=0;
        double ans = 0;
        for(int i=n ; i>0 ; i--){
          while((double)k > Math.pow(2,t)*(double)i ){
          t++;
          }
          //System.out.println(i+" "+t);
          ans += 1.0/((double)n*Math.pow(2,t));
        }
      System.out.println(ans);
    }
}