import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int Start = A + B;
    if(Start >= 24){
      Start -= 24;
    }
    System.out.print(Start);
  }
}
