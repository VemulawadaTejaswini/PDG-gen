  import java.util.*;
  public class Main {
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int a,b,c;
          a = sc.nextInt();
          b = sc.nextInt();
          c = sc.nextInt();
          int count = 0;
          if((a<b&&b<c)||(c<b&&b<a)){
          count ++;}
          for(int i=0;i<n-3;i++){
          a = b;
          b = c;
          c = sc.nextInt();
          if((a<b&&b<c)||(c<b&&b<a)){
          count ++;}
          }
          
          
          
          System.out.println(count);
          
          sc.close();
          }
          }