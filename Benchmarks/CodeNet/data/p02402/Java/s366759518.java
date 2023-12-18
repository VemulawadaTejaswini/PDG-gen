import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
     int min;
     int max;
     long sum = 0;
     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     int a = scanner.nextInt();
     min = a;
     max = a;
     sum = sum + a;
     for(int i=0;i<n-1;i++){
       int b = scanner.nextInt();
       sum = sum + b;
       if(min > b){
         min = b;
       }
       if(max < b){
         max = b;
       }
     }

     System.out.println(min + " " + max + " " + sum);

  }
}
