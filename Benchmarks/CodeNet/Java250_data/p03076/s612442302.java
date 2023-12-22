import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] time = new int[5];
    for (int i = 0; i < 5; i++) {
      time[i] = scanner.nextInt();
    }
    int minIdx = 0;
    int minMod = (time[0] - 1) % 10;
    for (int i = 1; i < 5; i++) {
      if ((time[i] - 1) % 10 < minMod) {
        minIdx = i;
        minMod = (time[i] - 1) % 10;
      }
    }
    int sum = 0;
    for (int i = 0; i < 5; i++) {
      if (i != minIdx) {
        sum += (time[i] + 9) / 10 * 10;
      }
    }
    sum += time[minIdx];
    System.out.println(sum);
  }

}
