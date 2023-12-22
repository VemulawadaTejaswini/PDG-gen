import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n;
    int x;
    int con;

    while(true){
      n = scanner.nextInt();
      x = scanner.nextInt();
      if(n==0&&x==0)break;

      con = 0;
      for(int i=1;i<=n;i++){
        for(int j=i+1;j<=n;j++){
          for(int k=j+1;k<=n;k++){
            if(i+j+k == x){
              con++;
            }
          }
        }
      }
      System.out.println(con);
    }

    }
}

