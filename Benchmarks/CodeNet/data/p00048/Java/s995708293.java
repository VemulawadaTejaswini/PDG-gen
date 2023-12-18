import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] name = {"light fly","fly","bantam","feather","light","light welter"
                    ,"welter","light middle","middle","light heavy","heavy"};
    double[] border = {48.0,51.0,54.0,57.0,60.0,64.0,69.0,75.0,81.0,91.0};
    start:
    while(sc.hasNext()) {
      double w = sc.nextDouble();
      for (int i = 0; i < 10; i++) {
        if (w <= border[i]) {
          System.out.println(name[i]);
          continue start;
        }
      }
      System.out.println(name[10]);
    }
  }
}