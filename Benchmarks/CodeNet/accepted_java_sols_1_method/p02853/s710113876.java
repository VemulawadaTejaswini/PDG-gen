import java.util.Scanner;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int X = scan.nextInt();
    int Y = scan.nextInt();
    scan.close();
    
    int[] scores = {0,300000,200000,100000};
    int score_x = X<=3 ? scores[X] : 0;
    int score_y = Y<=3 ? scores[Y] : 0;
    int add = X==1&&Y==1 ? 400000 : 0;
    System.out.println(score_x + score_y + add);
  }
}