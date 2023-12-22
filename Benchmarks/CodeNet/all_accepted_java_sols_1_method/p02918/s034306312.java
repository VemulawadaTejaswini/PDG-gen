import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      char[] c = sc.next().toCharArray();
      int cnt = 0;
      int res = 0;
      for(int i = 0;i < n-1;i++){
      	if(c[i]==c[i+1])cnt++;
      }
      res = Math.min(n-1,cnt+2*k);
      System.out.println(res);
    }
}