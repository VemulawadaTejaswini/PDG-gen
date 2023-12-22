import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r, c; // row, col
    while((r = sc.nextInt()) != 0 | (c = sc.nextInt()) != 0){
      for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
          System.out.printf("#");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}