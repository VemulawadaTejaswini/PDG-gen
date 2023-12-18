  import java.util.*;

  public class Main{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = Integer.parseInt(sc.next());
          int d = Integer.parseInt(sc.next());
          double i = 0,j = 0;
          int count = 0;
          double save = 0L;
          for(int cnt = 0;cnt < n;cnt++){
              i = Double.parseDouble(sc.next());
              j = Double.parseDouble(sc.next());
              save = Math.sqrt((double)(i * i + j * j));
              if(save <= d){
                  count++;
              }
          }
          System.out.println(count);
      }
  }