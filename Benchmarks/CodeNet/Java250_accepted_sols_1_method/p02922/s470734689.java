import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
  public static void main(String[] arrgs){
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int x=1,n=0;
    while(x<B){
      x = x+A-1;
      n++;
    }
    System.out.println(n);
  }
}
      