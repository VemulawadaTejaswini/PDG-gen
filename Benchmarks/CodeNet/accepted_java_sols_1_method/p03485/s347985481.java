import java.io.*;
import java.util.*;
import java.math.*;
public class Main{
    
    public static void main (String[] args) {
        int a,b,c,d,e;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
         b = sc.nextInt();
        float f = (float)(a+b)/2;
       float s = f*10;
      // System.out.println(f);
    //System.out.println(s);
     //   System.out.println(s%10);
       if(s%10<5){
           System.out.println((int) f);
       }else{
           System.out.println((int) f +1);
       }
        //c = sc.nextInt();
        //int t = a+b+c;
       // String ss = sc.next();
        //System.out.println(t+" "+ss);
    }
}