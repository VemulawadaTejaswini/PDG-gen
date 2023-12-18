import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int he = sc.nextInt();
      int wi = sc.nextInt();
      if (he == 0 && wi == 0) break;
      else{
        for(int i = 0; i < he; i++){
          for(int j = 0; j < wi; j++){
            if((i + j) % 2 == 0) System.out.print("#");
            else System.out.print(".");
          }
          System.out.println();
        }
      }
    }
  }
}