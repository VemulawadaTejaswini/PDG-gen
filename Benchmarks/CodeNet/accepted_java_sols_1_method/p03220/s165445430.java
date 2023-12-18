import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int kouhosu = sc.nextInt();
    int kion = sc.nextInt();
    int kibou = sc.nextInt();
    double min = 100000;
    int index = 0;
    for(int i = 0; i < kouhosu; i++) {
      double dis = Math.abs(kibou - kion + sc.nextDouble() * 0.006);
      if(dis < min) {
        min = dis;
        index = i;
      }
    }
    System.out.println(index + 1);
  }

}
