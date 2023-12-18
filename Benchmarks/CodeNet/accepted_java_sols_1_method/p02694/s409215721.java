import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        final long RISHI = s.nextLong();
        // int yokin = 100;
        double d_yokin = 100.0;
        int year = 0;

        while (d_yokin < RISHI) {
            d_yokin = Math.floor(d_yokin * 1.01);
            year++;
        }
        System.out.println(year);
  }
}