import java.util.Scanner;
class Main{
 public static void main(String args[]){
  double r,m,s;
  Scanner sc = new Scanner(System.in);
  r=sc.nextDouble();
  m=r*r*Math.PI;
  s=2*r*Math.PI;
  System.out.println(m+" "+s);
 }
}
