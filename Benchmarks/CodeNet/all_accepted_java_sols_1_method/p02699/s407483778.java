import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int w = sc.nextInt();
    String msg = (s>w) ? "safe" : "unsafe";
    System.out.println(msg);
  }
}