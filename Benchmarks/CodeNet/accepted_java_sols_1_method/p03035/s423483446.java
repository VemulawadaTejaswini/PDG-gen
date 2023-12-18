import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = 0;
    if(a >= 13)c = b;
    else if(a >= 6)c = b/2;
    else c = 0;
    System.out.println(c);
  }
}