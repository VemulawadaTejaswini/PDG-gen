import java.util.*;
import java.lang.Math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[N];
        for(int i=0;i<k;k++){
          for(int j=0;j<N;j++){
            int count=0;
            for(int jj=0;jj<N;jj++){
            if(a[jj]>=Math.abs(jj-j)){
              count++;
            }
            a[j]=count;
          }
          }
        }
       for(int jj=0;jj<N;jj++){
         System.out.print(a[jj]);
         System.out.print(" ");
       }
}
}