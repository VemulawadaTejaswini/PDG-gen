import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int H, W;
    
    while (in.hasNext()) {
      StringBuilder s = new StringBuilder();
      String crlf = System.getProperty("line.separator");
      H = in.nextInt();
      W = in.nextInt();
      if(H == 0 && W == 0) break;
      
      for (int h = 0; h < H; h++) {
        for (int w = 0; w < W; w++) {
          s.append("#");
        }
        s.append(crlf);
      }
      System.out.println(s.toString());
    }
  }
}