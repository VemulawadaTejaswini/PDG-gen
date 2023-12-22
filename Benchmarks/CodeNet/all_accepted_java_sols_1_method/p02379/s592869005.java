import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double x1 = sc.nextDouble();
    double y1 = sc.nextDouble();
    double x2 = sc.nextDouble();
    double y2 = sc.nextDouble();
    double answer1 = Math.pow(x2-x1,2) + Math.pow(y2-y1,2);
    double answer2 = Math.sqrt(answer1);
    System.out.println(answer2);
  }
}
