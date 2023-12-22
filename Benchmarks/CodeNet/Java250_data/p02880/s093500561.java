import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String answer = "No";
        for (int i = 1; i < 10; i++) {
          if((input % i) == 0 && (input / i) < 10){
          answer = "Yes";
          }
        }

        System.out.println(answer);
    }
}