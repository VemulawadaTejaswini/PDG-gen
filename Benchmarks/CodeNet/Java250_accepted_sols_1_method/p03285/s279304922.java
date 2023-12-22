import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int a4 = 0; a4 * 4 <= 100; a4 ++){
      for(int a7 = 0; a4 * 4 + a7 * 7 <= 100; a7 ++){
        if(a4*4+a7*7 == N){
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
    return;
  }
}