import java.util.*;
import java.lang.Math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
      int x=sc.nextInt();
      int n=sc.nextInt();
      int bigans=x;
      int smlans=x;
      for(int i=0;i<n;i++){
        int nx=sc.nextInt();
        if(bigans==nx){
          bigans=nx+1;
        }
        if(smlans==nx){
          smlans=nx-1;
        }
      }
      if(Math.abs(smlans)<Math.abs(bigans)){
        System.out.println(smlans);
      }else{
        System.out.println(bigans);
      }
}
}