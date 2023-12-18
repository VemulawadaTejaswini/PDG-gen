import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        int inputInt2 = scanner.nextInt();

      if(inputInt < 10 && inputInt2 < 10 ){  
      System.out.println(inputInt * inputInt2);
      } else {
            System.out.println(-1);
      }
    }
}