import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int ans,count;
    while(sc.hasNext()){
      ans = sc.nextInt();
      count = 0;
      for(int i = 0;i <= 9;i++){
        for(int j = 0;j <= 9;j++){
          for(int k = 0;k <= 9;k++){
            for(int l = 0;l <= 9;l++){
              if(ans == i + j + k + l) count++;
            }
          }
        }
      }
      System.out.println(count);
    }
  }
}