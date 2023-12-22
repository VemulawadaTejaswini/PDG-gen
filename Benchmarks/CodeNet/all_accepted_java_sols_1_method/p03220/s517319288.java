import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int kouhosu = sc.nextInt();
    int kion = sc.nextInt();
    int kibou = sc.nextInt();
    double[] kouhoti = new double[kouhosu];
    for(int i = 0; i < kouhosu; i++) {
      kouhoti[i] = sc.nextInt();
    }
    for(int i = 0; i < kouhosu; i++) {
      kouhoti[i] = kion - kouhoti[i] * 0.006;
    }
    double min = 100000;
    int index = 0;
    for(int i = 0; i < kouhosu; i++) {
      if(Math.abs(kibou - kouhoti[i]) < min) {
        min = Math.abs(kibou - kouhoti[i]);
        index = i;
      }
    }
    System.out.println(index + 1);
  }

}
