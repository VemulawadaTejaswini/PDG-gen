import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int a=kbd.nextInt();
   int b=kbd.nextInt();
   if(400<=a&&a<=599){
     b=8;
   }
   if(600<=a&&a<=799){
     b=7;
   }
   if(800<=a&&a<=999){
     b=6;
   }
   if(1000<=a&&a<=1199){
     b=5;
   }
   if(1200<=a&&a<=1399){
     b=4;
   }
   if(1400<=a&&a<=1599){
     b=3;
   }
   if(1600<=a&&a<=1799){
        b=2;
      }
      if(1800<=a&&a<=1999){
        b=1;
      }
      System.out.println(b);
    }
  }
