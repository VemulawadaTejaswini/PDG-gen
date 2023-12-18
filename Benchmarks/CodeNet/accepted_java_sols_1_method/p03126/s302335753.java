import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int n = sc.nextInt();
  	    int m = sc.nextInt();
      	//配列
        int K[] = new int[n];
      	int A[][] = new int[n][m]; 
      	int fav[] = new int[m];
      	int count = 0;
        for(int i = 0; i < n; i++){
         	K[i] = sc.nextInt();
          for(int j = 0; j < K[i] ; j++){
        	A[i][j] = sc.nextInt();
            //m=1~4⇒添え字0~3の配列に格納
			fav[A[i][j] - 1] += 1;
     	   }
        }
      	for(int i = 0; i < m; i++){
        if(fav[i] ==n){
          count = count+1;
        }
         }
       	 System.out.println(count);
     }
}