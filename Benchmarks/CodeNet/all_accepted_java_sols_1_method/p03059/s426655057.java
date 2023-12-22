import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int per = sc.nextInt();
    int maisu = sc.nextInt();
    int limitSecond = sc.nextInt();
    int result = (int)((limitSecond+0.5)/per)*maisu;
    System.out.println(result);
  }
}