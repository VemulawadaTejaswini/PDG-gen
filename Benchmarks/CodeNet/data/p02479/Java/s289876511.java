import java.util.Scanner;

class Main{
  public static void main(String[] args){
    float r , p;
    Scanner sc = new Scanner(System.in);
    r = sc.nextFloat();
    p = (float) Math.PI;
    System.out.printf("%f %f",  p*r*r , 2*r*p);
  }
}