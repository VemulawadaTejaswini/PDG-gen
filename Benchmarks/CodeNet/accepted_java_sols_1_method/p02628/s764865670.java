import java.util.Scanner;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
    int[] plist = new int[n];
    int sum = 0;
    for(int i = 0; i < n; i++) {
		int p = scan.nextInt();
    plist[i] = p;
    }
    Arrays.sort(plist);
    for(int i = 0; i < k; i++) {
      sum += plist[i];
    }

      System.out.println(sum);
    }
}
