import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true) {
      Double x1 = sc.nextDouble();
      Double y1 = sc.nextDouble();
      Double x2 = sc.nextDouble();
      Double y2 = sc.nextDouble();
      Double result = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
      System.out.println(result);
    }
  }
}