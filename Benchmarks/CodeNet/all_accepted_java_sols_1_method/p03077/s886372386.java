import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long[] times = new long[5];
    times[0] = sc.nextLong();
    times[1] = sc.nextLong();
    times[2] = sc.nextLong();
    times[3] = sc.nextLong();
    times[4] = sc.nextLong();

    int minNum = 0;
    for (int i = 1; i < 5; i++){
      if (times[i] < times[minNum]) {
        minNum = i;
      }
    }

    double bottleNeck = (double)N / (double)times[minNum];
    bottleNeck = Math.ceil(bottleNeck);
    long bottleNeckl = (long)bottleNeck;

    long t = bottleNeckl + 4;

    System.out.println(t);
  }
}
