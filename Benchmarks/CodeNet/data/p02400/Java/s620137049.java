import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    System.out.println(String.format("%.6f",r*r*PI));
  }
}
