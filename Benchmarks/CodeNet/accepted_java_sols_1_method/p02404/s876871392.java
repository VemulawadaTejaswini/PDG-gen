import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = 0;
    int W = 0;

    while(true){
      H = sc.nextInt();
      W = sc.nextInt();

      if(H != 0 && W != 0){
      for(int i = 0; i < H; i++){
        for(int j = 0; j < W; j++){
          if(i == 0 || j == 0 || i == H-1 || j == W-1) {
            System.out.print("#");
          } else {
            System.out.print('.');
          }
          }
        System.out.println("");
      }
      }else{
        return;
      }
        //sc.close();
        System.out.println("");
      }
  }
}

