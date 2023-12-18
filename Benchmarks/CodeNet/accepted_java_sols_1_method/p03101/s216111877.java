import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int H = Integer.parseInt(s[0]);
    int W = Integer.parseInt(s[1]);
    
    String[] t = sc.nextLine().split(" ");
    int h = Integer.parseInt(t[0]);
    int w = Integer.parseInt(t[1]);
    
    System.out.println((H-h) * (W-w));
  }
}