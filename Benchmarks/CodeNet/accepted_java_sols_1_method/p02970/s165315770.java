import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int kansi = 0;
    while(n>0){
      kansi++;
      n -= 1 + 2*d;
    }
    System.out.println(kansi);
  }
}
