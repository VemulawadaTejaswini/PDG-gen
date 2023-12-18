import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    double r, s, l;
    r = sc.nextDouble();
    s = r*r*Math.PI ;
    l = 2*r*Math.PI ;

    System.out.println( String.format("%.6f",s) + " " + String.format("%.6f",l) );

    } 
}
