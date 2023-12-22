import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    long C = Long.parseLong(sc.next());

    long x[] = new long[N];
    long v[] = new long[N];

    long calorie;
    long calorieForwardMax[] = new long[N + 1];
    long calorieForwardReturn[] = new long[N + 1];
    calorieForwardMax[0] = 0;
    calorieForwardReturn[0] = 0;
    long sumV = 0;

    for (int i = 0; i < N; i++) {
      x[i] = Long.parseLong(sc.next());
      v[i] = Long.parseLong(sc.next());
      sumV += v[i];
      calorie = sumV - x[i];
      calorieForwardMax[i + 1] = Math.max(calorie, calorieForwardMax[i]);
      calorieForwardReturn[i + 1] = Math.max(calorie - x[i], calorieForwardReturn[i]);
    }

    long calorieBackMax[] = new long[N + 1];
    long calorieBackReturn[] = new long[N + 1];
    calorieBackMax[0] = 0;
    sumV = 0;
    for (int i = 0; i < N; i++) {
      sumV += v[N - 1 - i];
      calorie = sumV - (C - x[N - 1 - i]);
      calorieBackMax[i + 1] = Math.max(calorie, calorieBackMax[i]);
      calorieBackReturn[i + 1] = Math.max(calorie - (C - x[N - 1 - i]), calorieBackReturn[i]);
    }

    long max = 0;
    for (int i = 0; i <= N; i++) {
      if (max < calorieForwardMax[i]) {
        max = calorieForwardMax[i];
      }
      if (max < calorieBackMax[N - i]) {
        max = calorieBackMax[N - i];
      }
      if (max < calorieForwardReturn[i] + calorieBackMax[N - i]) {
        max = calorieForwardReturn[i] + calorieBackMax[N - i];
      }
      if (max < calorieBackReturn[N - i] + calorieForwardMax[i]) {
        max = calorieBackReturn[N - i] + calorieForwardMax[i];
      }
    }
    System.out.println(max);
  }
}