import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int d = sc.nextInt();
   int t = sc.nextInt();
   int s = sc.nextInt();
   int dif = t * s;
   if (d<=t*s){
     System.out.println("Yes");
   }
   else{
     System.out.println("No");
  }
}
}
