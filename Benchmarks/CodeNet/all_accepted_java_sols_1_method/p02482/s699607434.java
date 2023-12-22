import java.util.Scanner;

class Main{
 public static void main(String[] args){
  int x, y;
  Scanner sc = new Scanner(System.in);
  x = sc.nextInt();
  y = sc.nextInt();
  if(x>y){
   System.out.println("a > b");
  } else if(x<y){
   System.out.println("a < b");
  } else {
   System.out.println("a == b");
  }
 }
}