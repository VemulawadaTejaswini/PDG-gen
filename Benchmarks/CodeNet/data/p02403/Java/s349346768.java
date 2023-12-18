import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int H, W;
    
    while (true) {
      StringBuilder s = new StringBuilder();
      H = in.nextInt();
      W = in.nextInt();
      if(H == 0 && W == 0) break;
      
      for (int w = 0; w < W; w++) {
        s.append("#");
      }
      for (int h = 0; h < H; h++) {
        System.out.println(s);
      }
    }
  }
}