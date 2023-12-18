import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String r = Float.parseFloat(sc.next());
    System.out.printf("%f %f\n", Float.parseFloat(Math*PI*r*r), Float.parseFloat(2*Math*PI*r));
  }
}
