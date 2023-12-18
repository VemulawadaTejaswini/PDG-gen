import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int K = Integer.parseInt(scan.nextLine());
    int seven = 7;
    for (int i = 0; i < 47483647; i++) {
      int remain = seven % K;
      if(remain == 0){
        System.out.println(i+1);
        return;
      }
      seven = remain*10 + 7;
    }
    System.out.println("-1");
  }
}