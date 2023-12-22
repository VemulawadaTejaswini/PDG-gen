import java.util.*;
import java.io.*;

public class Main{
 public static void main(String[] args) throws IOException
 {
   Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();
   long sum = 0;
   int min = 1000000;
   int max = -1000000;

   for(int i=0; i<n; i++){
       int a = sc.nextInt();
       sum += a;
       if(a < min){
           min = a;
       }
       if(a > max){
           max = a;
       }
   }

    System.out.println(min + " " + max + " " + sum);
 }
}