import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double[][] point = new double[N][2];
    for (int i = 0; i < N; i++) {
      point[i][0] = sc.nextDouble();
      point[i][1] = sc.nextDouble();
    }
    sc.close();
    double distance = 0;
    int count = 0;
    for (int i = 0; i < N-1; i++) {
      for (int j = i+1; j < N; j++) {
        distance += Math.sqrt(Math.pow(point[i][0]-point[j][0], 2) + Math.pow(point[i][1]-point[j][1], 2));
        count += 1;
      }
    }

    double out = distance * ((double)(N-1)/count);
    System.out.println(out);
  }
}
