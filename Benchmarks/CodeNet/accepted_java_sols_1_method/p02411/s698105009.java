import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true){
      int midterm = sc.nextInt();
      int fin = sc.nextInt();
      int makeup = sc.nextInt();

      int totalScore = midterm + fin;
      if (midterm == -1 && fin == -1 && makeup == -1){
        break;
      } else if (midterm == -1 || fin == -1) {
        System.out.println("F");
      } else {
        if (totalScore >= 80) {
          System.out.println("A");
        } else if (totalScore >= 65 && totalScore < 80) {
          System.out.println("B");
        } else if (totalScore >= 50 && totalScore < 65) {
          System.out.println("C");
        } else if (totalScore >= 30 && totalScore < 50) {
          if (makeup >= 50) {
            System.out.println("C");
          } else {
            System.out.println("D");
          }
        } else {
          System.out.println("F");
        }
      }
    }
  }
}

