import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,x,count;
    while((n = sc.nextInt()) != 0 | (x = sc.nextInt()) != 0){
      count=0;
      for(int i=1;i <= n-2;i++){
        for(int j=i+1;j <= n-1;j++){
          for(int k=j+1;k <= n;k++){
            if(i+j+k == x)count++;
          }
        }
      }
      System.out.println(count);
    }
    sc.close();
  }
}

