import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int count = 0;
    
    //x以下の間繰り返す
    for(int i = 0; i <= x; ++i){
      //1からべき乗か調べる
      for(int j = 2; j <= x; ++j){
        if((Math.pow(i,j)<= x) && (count<Math.pow(i,j))){
          count = (int)Math.pow(i,j);
        }
      }
    }
    if(count==0){
      count = 1;
    }
    System.out.println(count);
    
  }
}