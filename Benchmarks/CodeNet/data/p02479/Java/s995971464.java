import java.util.Scanner;

class Main{
  public static void main(String[] args){
    float r , p;
    Scanner sc = new Scanner(System.in);
    r = sc.nextFloat();
    p = (float) Math.PI;
    System.out.printf("%f %f\n", 2+r+p, p*r*r);
  }
}