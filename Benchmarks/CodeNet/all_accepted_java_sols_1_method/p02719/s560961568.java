import java.util.Scanner;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long x = scanner.nextLong(); 
    long y = scanner.nextLong();
    if(x<y){
      long d = Math.abs(x-y);
      if(x>d){
      	System.out.print(d);
       }
   	   else{
     	 System.out.print(x);}
    }
    else{
      long a = x%y;
      if(a==0){
        System.out.print(a);
      }
      else{
        long b = Math.abs(a-y);
        if(a>b){
      		System.out.print(b);
        }
        else{
          System.out.print(a);
        }
      }
    }
  }
}