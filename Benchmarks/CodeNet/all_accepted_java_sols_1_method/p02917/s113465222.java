import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    scan.nextLine();
    int[] AArray = new int[N];
    int[] BArray = new int[N - 1];

    for (int i = 0; i < N - 1; i++) {
      BArray[i] = scan.nextInt();
    }
    AArray[0] = BArray[0];
    for (int i = 1; i < N; i++) {
      AArray[i] = BArray[i - 1];
      if (i == N - 1) {
        break;
      }
      if (AArray[i] > BArray[i]) {
        AArray[i] = BArray[i];
      }
    }

    long result = 0;
    for (int i = 0; i < N; i++) {
      result += AArray[i];
    }
    System.out.println(result);

  }


}
