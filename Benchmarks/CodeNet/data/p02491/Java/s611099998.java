import java.util.*;
class Main{
 public static void main(String[] args){
  Scanner ·«áÈ = new Scanner(System.in);
  int a = 0, b = 0, d = 0;
  double f = 0;
  try{
   a = Integer.valueOf(·«áÈ.next());
   b = Integer.valueOf(·«áÈ.next());
  }catch(Exception e){
   System.out.println("    ");
  }
  d = a / b;
  System.out.print(d + " ");
  d = a % b;
  System.out.print(d + " ");
  f = a / b * 1.0;
  System.out.print(f + "\n");
 }
}