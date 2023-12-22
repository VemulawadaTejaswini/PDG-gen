import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      float a = sc.nextFloat();
      float b = sc.nextFloat();
      float c = sc.nextFloat();
      float d = sc.nextFloat();
      float e = sc.nextFloat();
      float f = sc.nextFloat();
      float x = (c*e-b*f)/(a*e-d*b);
      float y = (c*d-a*f)/(b*d-a*e);
      if(x == 0) {
        x = 0;
      }
      if(y == 0) {
	y = 0;
      }
      System.out.println(String.format("%.3f %.3f", x, y));
    }    
  }
}