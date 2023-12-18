import java.util.Scanner;
import java.text.*;
class Main{
 public static void main(String args[]){
  int a,b,s,r;
  double f;
  Scanner sc = new Scanner(System.in);
  DecimalFormat form = new DecimalFormat("##.0000000000000");
  a=sc.nextInt();
  b=sc.nextInt();
  s=a/b;
  r=a%b;
  f=(double)a/b;
  System.out.println(s+" "+r+" "+form.format(f));
 }
}
