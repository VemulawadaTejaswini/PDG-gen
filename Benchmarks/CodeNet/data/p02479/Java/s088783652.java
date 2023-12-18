import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double r = input.nextDouble();

    System.out.println(Math.PI * r * r + " " + 2 * Math.PI * r);
  }
}