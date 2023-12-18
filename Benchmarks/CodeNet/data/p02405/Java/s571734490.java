import java.util.*;
 
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int H, W;
     
    while (in.hasNext()) {
      StringBuilder odd  = new StringBuilder();
      StringBuilder even = new StringBuilder();
      StringBuilder total = new StringBuilder();
      String crlf = System.getProperty("line.separator");
      H = in.nextInt();
      W = in.nextInt();
      if(H == 0 && W == 0) break;
       
      for (int w = 0; w < W; w++) {
        if (w % 2 == 1) { 
          odd.append("#");
          even.append(".");
        } else {
          odd.append(".");
          even.append("#");
        }
      }
      odd.append(crlf);
      even.append(crlf);
       
      for (int h = 0; h < H; h++) {
        if (h % 2 == 1) total.append(odd);
        else            total.append(even);
      }
      System.out.println(total.toString());
    }
  }
}