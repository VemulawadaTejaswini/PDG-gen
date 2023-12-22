import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] array = new char[h][w];
		int[][] cal = new int[h][w];
		
		//初期化
		for(int i=0; i < h; i++){
		    String line = sc.next();
		    for(int j=0; j < w; j++){
		        array[i][j]=line.charAt(j);
		        cal[i][j]=0;
		    }
		}
		
		//計算
		for(int i=0; i < h; i++){
		    for(int j=0; j < w; j++){
		        if(array[i][j]=='#'){
		          //上があるなら
		          if(i!=0){
		              if(j!=0){cal[i-1][j-1] += 1;}
		              if(j!=w-1){cal[i-1][j+1] += 1;}
		              cal[i-1][j] += 1;
		          }
		          //下があるなら
		          if(i!=h-1){
		              if(j!=0){cal[i+1][j-1] += 1;}
		              if(j!=w-1){cal[i+1][j+1] += 1;}
		              cal[i+1][j] += 1;
		          }
		          
		          //左があるなら
		          if(j!=0){
		              cal[i][j-1] += 1;
		          }
		          
		          //右があるなら
		          if(j!=w-1){
		              cal[i][j+1] += 1;
		          }    
		        }
		    }
		}

        //出力
		for(int i=0; i < h; i++){
		    for(int j=0; j < w; j++){
		       if(array[i][j]=='#'){
		          System.out.print(array[i][j]);
		       } else {
		          System.out.print(cal[i][j]); 
		       }
		    }
		    System.out.println("");
		}
	}
}