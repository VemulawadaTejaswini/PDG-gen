import java.util.*;
import java.util.ArrayList;

public class Main{
 public static void main(String[] args){
  int w;
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  if ( a > b ){
   w = a;
   a = b;
   b = w;
  };
  if ( b > c ){
   w = b;
   b = c;
   c = w;
  };
  if ( a > b ){
   w = a;
   a = b;
   b = w;
  };
  System.out.println(a + " " + b + " " + c);
 }
}
