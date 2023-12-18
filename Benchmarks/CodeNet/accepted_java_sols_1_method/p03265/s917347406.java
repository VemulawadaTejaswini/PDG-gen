import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String num[] = sc.nextLine().split(" ");
    int xdiff = Integer.parseInt(num[2])-Integer.parseInt(num[0]);
    int ydiff = Integer.parseInt(num[3])-Integer.parseInt(num[1]);
    System.out.println(String.valueOf(Integer.parseInt(num[2])-ydiff)+ " "+ String.valueOf(Integer.parseInt(num[3])+xdiff) + " "+ String.valueOf(Integer.parseInt(num[0])-ydiff)+ " " + String.valueOf(Integer.parseInt(num[1])+xdiff));
  }
}