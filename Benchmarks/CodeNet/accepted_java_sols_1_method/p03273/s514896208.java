import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      char[][] a = new char[h][w];
      for(int i=0;i<h;i++){
        String s = sc.next();
        for(int j=0;j<w;j++){
          a[i][j] = s.charAt(j);
        }
      }
      //行削除
      int[] H = new int[h];
      int c =0;
      for(int i=0;i<h;i++){
        int count =0;
        for(int j=0;j<w;j++){
          if(a[i][j]=='.'){
            count++;
          }
        }
          if(count!=w){
          	H[c]=i;
            c++;
          }
      }
      //列削除
      int[] W = new int[w];
      int d=0;
      for(int j=0;j<w;j++){
        int count =0;
        for(int i=0;i<h;i++){
          if(a[i][j]=='.'){
            count++;
          }
        }
          if(count!=h){
          	W[d]=j;
            d++;
          }
      }
      //出力
      for(int i=0;i<c;i++){
        for(int j=0;j<d;j++){
          System.out.print(a[H[i]][W[j]]);
        }
        System.out.println();
      }
    }
}