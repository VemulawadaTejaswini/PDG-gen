import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long L = sc.nextLong();
    long R = sc.nextLong();

    sc.close();

    long r = Math.min(R, L + 2019);

    long min = 2018;
    
    for (long i = L; i <= r; i++){
      for (long j = i + 1; j <= r; j++){
        long m = (i % 2019) * (j % 2019) % 2019;
        min = Math.min(min, m);
      }
    }

    System.out.println(min);
    
  }

}