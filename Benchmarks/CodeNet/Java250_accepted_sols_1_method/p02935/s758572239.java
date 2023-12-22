import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    float v[] = new float[n];
    for (int i = 0; i < n; i++) {
      v[i] = sc.nextFloat();
    }

    Arrays.sort(v);

    float avg = v[0];
    for (int i = 1; i < n; i++) {
      avg = (avg + v[i]) / 2;
    }
    System.out.println(avg);
  }
}
