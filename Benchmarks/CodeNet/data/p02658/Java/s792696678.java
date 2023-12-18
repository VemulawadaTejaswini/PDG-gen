import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	long seki = 1;
      	do {
          seki = seki * sc.nextLong();
          if (seki == 0) {
            break;
          }
        } while(sc.hasNext());

      	if (seki / Math.pow(10, 18) > 0) {
          seki = -1;
        }
        System.out.println(seki);
    }
}