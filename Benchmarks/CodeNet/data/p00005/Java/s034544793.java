import java.util.*;
public class Main{
 void run() {
  Scanner sc = new Scanner(System.in);
  for(;sc.hasNext();){
   int a = sc.nextInt();
   int b = sc.nextInt();
   System.out.println( gcd(a, b) + " " + lcm(a, b) );
  }
 }
 int gcd(int a, int b){
  if(a==0) return b;
  return gcd(b, a%b);
 }
 int lcm(int a, int b){
  return a/gcd(a, b)*b;
 }
 public static void main(String[] args){
  new Main().run();
 }
}