import java.util.Scanner;

class Main {  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double x1 = in.nextDouble();
    double x2 = in.nextDouble();
    double y1 = in.nextDouble();
    double y2 = in.nextDouble();

    double distance = Math.sqrt((x1 - y1)*(x1 - y1) + (x2 - y2)*(x2 - y2));
    
    System.out.printf("%5.8f", distance);
    
  }
}