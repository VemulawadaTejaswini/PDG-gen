import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

            long x = sc.nextLong();

            for (long j = x;j<1000000 ;j++ ) {
              int count = 0;
              for (long i = 2;i<x;i++ ) {
                if (x%i==0) {
                  count++;
                }
                }
                if(count==0){
                  System.out.println(x);
                  System.exit(0);
                }
                x++;
              }
            }


      }
