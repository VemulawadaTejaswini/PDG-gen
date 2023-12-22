import java.util.*;
  public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int c = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      int count = 0;
      for(int d = 0; d <= a; d++){
        for(int e = 0; e <=b; e++){
          for(int f = 0; f <= c; f++){
            int total = 500*d+100*e+50*f;
            if (total == x){
              count++;
            }
          }
        }
      }
      System.out.println(count);
    }
  }