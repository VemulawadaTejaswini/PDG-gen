import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    scanner.close();
    int count = 0;
    int A = 1;
    boolean flag = false;

    for (int C = 1; C < N; C++){
      for (int B = 1; B <= (N - C) / B; B++){
        if ((N - C) % B == 0){
          if (B == (N - C) / B){
            count++;
            break;
          }
          count += 2;
        }
      }
    }

    System.out.println(count);
  }
}