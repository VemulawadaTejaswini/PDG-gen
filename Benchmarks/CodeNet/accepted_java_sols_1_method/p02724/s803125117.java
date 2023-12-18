import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int urs = 0;
    while(x >= 500){
      x -= 500;
      urs += 1000;
    }
    while(x >= 5){
      x -= 5;
      urs += 5;
    }
    System.out.println(urs);
  }
}
