import java.io.*;
import java.util.*;

public class Main{
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), M = sc.nextInt();
    int X = sc.nextInt(), Y = sc.nextInt();
    int maxX = X, minY = Y;
    for(int i = 1; i<=N; i++){
      int x = sc.nextInt();
      maxX = Math.max(x, maxX); 
    }
    for(int i = 1; i<=M; i++){
      int y = sc.nextInt();
      minY = Math.min(y, minY);
    }
    if(maxX < minY){
      System.out.println("No War"); 
    }
    else{
      System.out.println("War");
    }
  }
}
