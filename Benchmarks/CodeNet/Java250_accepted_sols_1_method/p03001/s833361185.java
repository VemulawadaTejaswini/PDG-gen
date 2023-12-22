import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double H = scan.nextDouble();
    double W = scan.nextDouble();
    double X = scan.nextDouble();
    double Y = scan.nextDouble();
    int c = 0;
    if (X==H/2 && Y==W/2){
      c = 1;
    }
    System.out.println((H*W/2)+" "+c);
  }
}