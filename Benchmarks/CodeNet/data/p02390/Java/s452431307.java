import java.util.*;

class Main{
   public static void main(String args[]){
   Scanner str = new Scanner(System.in);
   int sc = str.nextInt();
   int h = 0;

      int b = 0;
      int s = 0;
      while(true){
          h =h + 1;
          int a =h*3600;
          if (a > sc){
              h = h - 1;
              break;
          }
      }

      int q = sc - h*3600;

      while(true){
          b = b + 1;
          int a =b*60;
          if ( a > q){
              b -= 1;
              break;
          }
      }



      s = q - b*60;
      System.out.println(String.valueOf(h) + ":" +String.valueOf(b) + ":"+String.valueOf(s));
      }
   }