import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int t = sc.nextInt();
    
    int minutes = (int) (t + 0.5) / a;
    int amounts = minutes * b;
    
    System.out.println(amounts);
  }
}