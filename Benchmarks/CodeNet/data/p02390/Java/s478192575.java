import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    //int h,m,s;
    
    //int amari = a%60;
    if(a < 60){
       int s = a;
       int m = 0;
       int h = 0;
        System.out.println(+  h + ":" + m + ":" + s);
     }
    if(a > 60){
       int syou = a/60;
      if(syou < 60){
       int m = syou;
       int amari = a%60;
       int s = amari;
       int h = 0;
        System.out.println(+  h + ":" + m + ":" + s);

      }else if(syou > 60){
       int syou2 = syou/60;
       int h = syou2;
       int amari = a%60;
       int s = amari;
       int amari2 = syou2%60;
       int m = amari2;
        System.out.println( +  h + ":" + m + ":" + s);
      }
     }

       
   
  }

}