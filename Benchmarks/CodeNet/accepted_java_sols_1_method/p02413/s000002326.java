import java.util.*;

public class Main{
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
		  int r = sc.nextInt();        //行数r
		  int c = sc.nextInt();        //列数c
		  
		  int[][] a = new int[r + 1][c + 1];
		  
		  //r × c の要素を持つ表
		  for(int i = 0; i < r; i++){
		        for(int j = 0; j < c; j++){
			    a[i][j] = sc.nextInt();
//		         System.out.print(a[i][j] +" ");
		        }
		  }
	  
		  //r行 計算処理
		  for(int i = 0; i < r; i++){
		        for(int j = 0; j < c; j++){
		        	a[r][j] +=a[i][j];
		        }
		  }
		  
		//c列 計算処理
		  for(int i = 0; i <= r; i++){
		        for(int j = 0; j < c; j++){
		        	a[i][c] +=a[i][j];
		        }
		  }
		  
		  
		  //結果出力
		  for(int i = 0;i <= r;i++){
			  for(int j = 0;j <= c;j++){
				  if(j == c){
		            System.out.print(a[i][j]);
				  }else{
					System.out.print(a[i][j] +" ");
				  }
			  }
			  System.out.println("");
		  }
	  }
}

