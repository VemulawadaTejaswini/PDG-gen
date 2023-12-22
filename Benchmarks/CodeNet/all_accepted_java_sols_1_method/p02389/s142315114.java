import java.util.Scanner;
 public class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int y = in.nextInt();
      int menseki = x * y;
      int syuu = (x + y) * 2;
      System.out.println(""+menseki+" "+syuu+"");
    }
  }