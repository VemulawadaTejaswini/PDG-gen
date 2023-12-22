import java.util.*;
 
public class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int count = 0;
    int que = 0;
    int num = Integer.parseInt(in.nextLine());
    for(int i = 0; i < num; i++) {
      que <<= 5;
      que += Integer.parseInt(in.next());
      if (i > 1) {
        int a = (que >> 10) & 31;
        int b = (que >> 5) & 31;
        int c = que & 31;
        if ((a - b) * (c - b) < 0) {
          count++;
        }
      }
    }
    in.close();
    System.out.println(count);
  }
}