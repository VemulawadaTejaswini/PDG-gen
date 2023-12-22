import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    double a = scan.nextDouble();

 System.out.println(String.format("%.6f",a * a * Math.PI)+" "+String.format("%.6f",2 * a * Math.PI));
  }
}
