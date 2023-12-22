import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int H,W;
    H = s.nextInt();
    W = s.nextInt();
    String[] str = new String[H];
    for(int i = 0; i < H; i++){
      //for(int j = 1; i < W++){
        str[i] = s.next();
      //}
    }
    for(int i = 0; i < H; i++){
      //for(int j = 1; i < W++){
        System.out.println(str[i]);
        System.out.println(str[i]);
      //}
    }
  }
}