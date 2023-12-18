import java.util.*;
import java.lang.Math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
      if(n==0){
        System.out.println(X);
      }else{
		int X = sc.nextInt();
        int n = sc.nextInt();
        int cannotuse[]=new int[100];
        for(int i=0;i<n;i++){
          cannnotuse[sc.nextInt-1]=1;
        }
      int abssa=100;
      int realsa=100;
        for(int i=0;i<100;i++){
          if(Math.abs(cannnotuse[i]-X)<abssa){
            abssa=Math.abs(cannnotuse[i]-X);
            realsa=cannnotuse[i]-X;
          }
        }
      System.out.println(X+realsa);
      }
}
}