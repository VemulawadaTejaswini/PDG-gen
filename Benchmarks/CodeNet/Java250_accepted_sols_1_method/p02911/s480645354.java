import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int k = sc.nextInt();
		int q = sc.nextInt();
        int[] a = new int[q];//回答者ナンバー
        for(int i=0;i<q;i++)
          a[i] = sc.nextInt();
      
      	int[] point = new int[n];//参加者が持つポイント
        for(int i=0;i<n;i++)
          point[i] = k;
        
        for(int j=0;j<point.length;j++){
          point[j]-=a.length; 
         }
        for(int i=0;i<a.length;i++){
          point[a[i]-1]++;
        }
        
      
      for(int i=0;i<n;i++){
       if(point[i]>0)System.out.println("Yes");
        else System.out.println("No");
      }
	}
}
