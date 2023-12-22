import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int cnt = 0;

    outside:for(int i = 0; i <= n/4; i++){
      for(int j = 0; j <= n/7; j++){
        if(4*i + 7*j == n){
          System.out.println("Yes");
          cnt++;
          break outside;
      }
    }
  }

    if(cnt==0)
      System.out.println("No");
    }
  }
