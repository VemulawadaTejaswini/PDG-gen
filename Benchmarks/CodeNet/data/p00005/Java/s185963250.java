import java.util.*;
public class Main{
 void run() {
  Scanner sc = new Scanner(System.in);
  for(;sc.hasNext();){
   long a = sc.nextLong();
   long b = sc.nextLong();
   System.out.println( gcd(a, b) + " " + lcm(a, b) );
  }
 }
 long gcd(long a, long b){
  if(b==0) return a;
  return gcd(b, a%b);
 }
 long lcm(long a, long b){
  return a/gcd(a, b)*b;
 }
 public static void main(String[] args){
  new Main().run();
 }
}