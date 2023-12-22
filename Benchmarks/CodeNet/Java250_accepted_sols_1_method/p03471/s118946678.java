import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long Y = sc.nextLong();
    
    for(int i=0; i <= N; i++) {
      for(int j = 0; j <= N - i; j++) {
        int l = N - i - j;
        int y = i*10000 + j*5000 + l*1000;
        
        if(y==Y){
          System.out.println(i + " " + j + " " + l );
          return;
        }
      }
    }
    System.out.println("-1 -1 -1");
  }
}
    