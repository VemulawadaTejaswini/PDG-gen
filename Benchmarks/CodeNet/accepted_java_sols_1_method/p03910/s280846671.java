import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args){
      Scanner sc  = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      long sum = (long)n*(n+1)/2;
      long min = 0;
      boolean[] is = new boolean[n+1];
      for(int i=n;i>0;i--){
        if(sum-i>=n){
          is[i] = true;
          sum-=i;
        }
      }
      PrintWriter out = new PrintWriter(System.out);
      for(int i=1;i<=n;i++){
        if(!is[i]){
          out.println(i);
        }
      }
      out.flush();
      
    }
}