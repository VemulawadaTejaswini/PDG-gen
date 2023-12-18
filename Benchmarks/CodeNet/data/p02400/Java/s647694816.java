import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    double a = r*r*Math.PI;
    System.out.println(String.format("%.6f",a));
  }
}

