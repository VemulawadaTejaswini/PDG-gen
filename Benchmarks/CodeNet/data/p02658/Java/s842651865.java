import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	Long seki = 1L;
      	do {
          seki = seki * sc.nextLong();
          if (seki == 0) {
            break;
          }
          if (seki.compareTo(1000000000000000000L) == 1) {
            seki = -1L;
            break;
          }
        } while(sc.hasNext());

        System.out.println(seki);
    }
}