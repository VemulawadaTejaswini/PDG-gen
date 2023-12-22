import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int answer = 0;
    
    if (a == b) {
        answer = a + b;
    } else if (a > b) {
        answer = a + a - 1;
    } else if (a < b) {
        answer = b + b - 1;
    }
    
    System.out.println(answer);
  }
}