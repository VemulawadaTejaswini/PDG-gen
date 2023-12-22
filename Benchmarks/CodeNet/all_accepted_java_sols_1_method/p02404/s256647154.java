import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int H, W;
    
    while (true) {
      StringBuilder peri = new StringBuilder();
      StringBuilder mid  = new StringBuilder();
      String crlf = System.getProperty("line.separator");
      H = in.nextInt();
      W = in.nextInt();
      
      if (H == 0 && W == 0) break;
      
      for (int w = 0; w < W; w++) {
        peri.append("#");
      }
      for (int w = 0; w < W; w++) {
        if (w == 0 || w == W - 1) mid.append("#");
        else                      mid.append(".");
      }
      for (int h = 0; h < H; h++) {
        if (h == 0 || h == H - 1) System.out.println(peri);
        else                      System.out.println(mid);
      }
      System.out.print(crlf);
    }
  }
}