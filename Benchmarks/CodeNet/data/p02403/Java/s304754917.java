import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    while(true){
      int H = sc.nextInt();
      int W = sc.nextInt();
      if(H == 0 && W == 0){
        break;
      }
      for(x = 0; x < H; x++){
        for(y = 0; y < W; y++){
          System.out.print("#");
        }
        System.ont.println("");
      }
      System.out.println("");
    }
  }
}

