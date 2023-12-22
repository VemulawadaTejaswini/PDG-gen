import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int max = 0;
    int ans = 0;
    int cnt = 0;

    for(int i = 1; i <= n; i++){
      int j = i;
      while(j % 2 == 0){
        j /= 2;
        cnt++;
      }
      if(cnt >= max){
        max = cnt;
        ans = i;
      }
      cnt = 0;
    }
    System.out.println(ans);
  }
}
