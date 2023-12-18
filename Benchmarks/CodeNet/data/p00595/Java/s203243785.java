import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
   while(s.hasNext()) {
   String[] line = s.nextLine().split(" ");
   int a = Integer.parseInt(line[0]);
   int b = Integer.parseInt(line[1]);
   System.out.println(gcd(a,b));
   }
  }

  public static int gcd(int a, int b) {
  if(b == 0) return a;
  else return gcd(b, a%b);
  }
}