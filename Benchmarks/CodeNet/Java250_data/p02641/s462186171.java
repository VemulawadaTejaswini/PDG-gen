import java.util.*;
import java.lang.Math.*;
import java.util.Arrays;
import java.util.Collections;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
      int x=sc.nextInt();
      int n=sc.nextInt();
      int bigans=x;
      int smlans=x;
      Integer ns[]=new Integer[n];
      for(int i=0;i<n;i++){
        ns[i]=sc.nextInt();
      }
      Arrays.sort(ns);
      for(int i=0;i<n;i++){
        int nx=ns[i];
        if(bigans==nx){
          bigans=nx+1;
        }
      }
      Arrays.sort(ns, Collections.reverseOrder());
      for(int i=0;i<n;i++){
        int nx=ns[i];
         if(smlans==nx){
          smlans=nx-1;
        }
      }
      if(Math.abs(bigans-x)<Math.abs(smlans-x)){
        System.out.println(bigans);
      }else{
        System.out.println(smlans);
      }
}
}