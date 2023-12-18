import java.util.Scanner;

class Main{
  public static void main(String[] args){
    float r ;
    Scanner sc = new Scanner(System.in);
    r = sc.nextFloat();
    System.out.printf("%f %f\n",  Math.PI*r*r , 2*r*Math.PI);
  }
}