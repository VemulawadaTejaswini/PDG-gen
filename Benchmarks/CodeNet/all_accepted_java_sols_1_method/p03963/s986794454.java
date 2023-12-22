import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
    double k = sc.nextDouble();
    System.out.println( (int)(Math.pow((k-1),(n-1))*k) );
  }
}