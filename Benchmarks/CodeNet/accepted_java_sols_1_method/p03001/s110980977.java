import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double w = sc.nextDouble();
    double h = sc.nextDouble();
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    System.out.println((w*h)/2);
    if((x == w/2)&&(y == h/2)){
      System.out.println("1");
    }else{
      System.out.println("0");
    }
  }
}
                         