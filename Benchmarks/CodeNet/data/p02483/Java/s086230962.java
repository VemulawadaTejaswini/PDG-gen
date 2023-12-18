import java.util.Scanner;

class Main{
 public static void main(String[] args){
  int x , y , z , w;
  Scanner sc = new Scanner(System.in);
  x = sc.nextInt();
  y = sc.nextInt();
  z = sc.nextInt();
  if (x>y) {
   w=x; x=y; y=w;
  }
  if (y>z){
  w=y; y=z; z=w;
  }
  if (x>y) {
   w=x; x=y; y=w;
  }
  System.out.println(x+" "+y+" "+z);
 }
}