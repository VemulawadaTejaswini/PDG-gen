import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    int taro = 0;
    int hanako = 0;

    for (int i = 0; i < n; i++) {
      
      String taros = scan.next();
      String hanakos = scan.next();

      int result = taros.compareTo(hanakos);
      if (result > 0) {
        taro += 3;
      } else if (result < 0) {
        hanako += 3;
      } else {
        taro++;
        hanako++;
      }

    }
    
    System.out.println(taro + " " + hanako);

  }

}

