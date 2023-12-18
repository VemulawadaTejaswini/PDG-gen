import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    boolean tmp = true;
    String pat = "#.";

    while(tmp){
      int h = sc.nextInt();
      int w = sc.nextInt();

      if(h == 0 && w == 0){
        tmp = false;
        break;
      }

      for(int i = 0; i < h; i++){
        for(int j = 0; j < w; j++){
          if((i + j) % 2 == 0){
            System.out.print("#");
          } else if((i + j) % 2 == 1){
            System.out.print(".");
          }
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}

