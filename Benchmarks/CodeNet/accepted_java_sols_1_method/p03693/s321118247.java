import java.util.*;
public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int red = Integer.parseInt(sc.next());
  int green = Integer.parseInt(sc.next());
  int blue = Integer.parseInt(sc.next());
  int ans = red*100 + green*10 + blue;
  if (ans%4 == 0){
    System.out.println("YES");
  }
  else {
    System.out.println("NO");
  }
  }
}
