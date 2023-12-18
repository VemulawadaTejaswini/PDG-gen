import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String n = sc.next();
   char[] s = n.toCharArray();
   int calc = 0;
   boolean rain = false;
   for(int i=0;i<2;i++){
     if (s[i]=='R') {
       rain =true;
       if(s[i+1]=='R'){
         calc++;
       }
     }
   }
   if (rain) {
    System.out.println(calc+1);
   }
   else{
     System.out.println(0);
   }

  }
}