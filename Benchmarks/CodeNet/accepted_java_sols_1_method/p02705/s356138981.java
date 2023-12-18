import java.util.Scanner;
class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    
    int R = sc.nextInt();
    double length = 2*R*Math.PI;
    
    System.out.println(length);
  }
}