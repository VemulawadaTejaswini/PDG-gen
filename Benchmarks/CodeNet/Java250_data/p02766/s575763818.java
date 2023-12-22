import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        String[] t = scan.nextLine().split("\\s");
        int n = Integer.valueOf(t[0]);
        int r = Integer.valueOf(t[1]);
        int c = n / r;
      	int p = 1;
        while (c != 0) {
          	c = c / r;
          	p++;
        }
        System.out.print(p);
    }
}