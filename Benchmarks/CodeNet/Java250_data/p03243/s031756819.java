import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.next());
    
    int i = 1;
    while(111*i < N) {
      i++;
    }
    
    System.out.println(111*i);
    
  }
}