import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int W = scan.nextInt();
        int H = scan.nextInt();
        int N = scan.nextInt();
        
        //int white_area = W * H;
        int whiteBox[][] = new int [W][H];
        
        int x[] = new int[N];
        int y[] = new int[N];
        int a[] = new int[N];
        
        int cnt = 0;
        
        for( int i = 0 ; i < N ; i++ ){
          x[i] = scan.nextInt();
          y[i] = scan.nextInt();
          a[i] = scan.nextInt();
        }
        
        for( int i = 0 ; i < W ; i++ ){
          for( int j = 0 ; j < H ; j++ ){
            whiteBox[i][j] = 0;
          }
        }
        
        for(int i = 0 ; i < N ; i++){
          
          if(a[i]==1){//xiの内側を塗る
            for(int ww = 0 ; ww < x[i] ; ww++){
              for(int hh = 0 ; hh < H ; hh++){
                whiteBox[ww][hh] = 1;
              }
            }
          }
          
          else if(a[i]==2){//xiの外側を塗る
            for(int ww = x[i] ; ww < W ; ww++){
              for(int hh = 0 ; hh < H ; hh++){
                whiteBox[ww][hh] = 1;
              }
            }
          }
          
          else if(a[i]==3){//yiの内側を塗る
            for(int hh = 0 ; hh < y[i] ; hh++){
              for(int ww = 0 ; ww < W ; ww++){
                whiteBox[ww][hh] = 1;
              }
            }
          }
          
          else if(a[i]==4){//yiの外側を塗る
            for(int hh = y[i] ; hh < H ; hh++){
              for(int ww = 0 ; ww < W ; ww++){
                whiteBox[ww][hh] = 1;
              }
            }
          }
          
        }
        
        for( int i = 0 ; i < W ; i++ ){
          for( int j = 0 ; j < H ; j++ ){
            if(whiteBox[i][j] == 0)cnt++;
          }
        }
        
        System.out.println(cnt);
	  }
}