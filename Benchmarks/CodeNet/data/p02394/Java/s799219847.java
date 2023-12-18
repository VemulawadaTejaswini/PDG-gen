import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int W = sc.nextInt();
      int H = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int r = sc.nextInt();
      
      //真偽を代入して見やすく
      boolean A = r <= x;
      boolean B = x <= W - r;
      boolean C = r <= y;
      boolean D = y <= H - r;
      if(A && B && C && D){
          System.out.println("Yes");
      }else{
          System.out.println("No");
      }
    }
}
