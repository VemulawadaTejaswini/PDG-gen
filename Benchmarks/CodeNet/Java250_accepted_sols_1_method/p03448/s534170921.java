import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int yen500 = sc.nextInt();
    int yen100 = sc.nextInt();
    int yen50 = sc.nextInt();
    int total = sc.nextInt();
    
    sc.close();

    int count = 0;

    for (int i = 0; i <= yen500; i++) {
      for (int j = 0; j <= yen100; j++) {
        for (int k = 0; k <= yen50; k++) {
          if (total == (i * 500 + j * 100 + k * 50)) {
            count++;
          }
        }
      }   
    }

    System.out.println(count);
  
  }
}