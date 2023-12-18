import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = 0;
    int l = 0;
    while(true) {
      l = 0;
      int h = sc.nextInt();
      int w = sc.nextInt();
      if (h == 0 && h == 0) {
        break;
      }
      for(int i = 0;i < h;i++){
        if(l == 0){
          k = 0;
          l = 1;
        }else{
          k = 1;
          l = 0;
        }
        for(int j = 0;j < w;j++){
          if(k == 0){
            System.out.printf("#");
            k = 1;
          }else{
            System.out.printf(".");
            k = 0;
          }
        }
        System.out.printf("\n");
      }
    }
  }
}