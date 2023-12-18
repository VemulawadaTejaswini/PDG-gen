import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    
    String str[] = new String[h];
    char a[][] = new char[h][w];
    
    //入力値をいったん配列に入れる
    for(int i = 0 ; i < h ; ++i){
      str[i] = sc.next();
    }
    //分割して多次元配列に入れる
    for(int i = 0 ; i < h ; ++i){
      for(int j = 0 ; j < w ; ++j){
        a[i][j] = str[i].charAt(j);
      }
    }
    
    
    int h_result[] = new int[w];
    
    //縦でチェック
    for(int i = 0 ; i < w ; ++i){
      int count = 0;
      for(int j = 0 ; j < h ; ++j){
        if(a[j][i] == '.'){
          count++;
        }else{
          break;
        }
        if(count == h){
          h_result[i] = 1;
        } 
      }
    }
    //縦全部白のところは１になっている
    
    int w_result[] = new int[h];
    //横でチェック
    for(int i = 0 ; i < h ; ++i){
      int count = 0;
      for(int j = 0 ; j < w ; ++j){
        if(a[i][j] == '.'){
          count++;
        }else{
          break;
        }
        if(count == w){
          w_result[i] = 1;
        } 
      }
    }
    //横全部白のところは１になっている
    
    for(int i = 0 ; i < h ; ++i){
      for(int j = 0 ; j < w ; ++j){
        if(h_result[j]!=1 && w_result[i]!=1){
          System.out.print(a[i][j]);
        }
      }
      if(w_result[i]==1){
        continue;
      }
      System.out.println("");
    }
    
    
    
  }
}