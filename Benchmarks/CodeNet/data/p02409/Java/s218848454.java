import java.util.*;

public class Main{
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();        //n件
		  int[][][] count = new int[4][3][10];
		  
		  
		  //b棟f階のr番目の部屋にv人が追加で入居した情報を宣言
		  for(int i = 0; i < n; i++){
			int b = sc.nextInt(); //b棟
		    int f = sc.nextInt(); //f階
		    int r = sc.nextInt(); //r番目の部屋
		    int v = sc.nextInt(); //v人入居
		    count[b - 1][f - 1][r - 1] += v;
		  }

		  //表示させるものを宣言
		         for (int i = 0; i < count.length; i++) {
		             for (int j = 0; j < count[i].length; j++) {
		            	 for (int k = 0; k < count[i][j].length; k++) {
		            		 System.out.print(" " + count[i][j][k]);
		            	 }
		            	 System.out.println("");
		             }
		             if(i < 3){
		             System.out.println("####################");
		             }
		         }
      }
}

