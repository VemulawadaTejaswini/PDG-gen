import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double t = (y - 2 * x) / 2;
        double c = (4 * x - y) / 2;
        double legs = 4 * Math.abs(t) + 2 * Math.abs(c);
        if (y % 2 == 1) {
            System.out.println("No");
        }
        else if (t > 0 && c > 0 && legs == y) {
            System.out.println("Yes");
        }
        else {
           System.out.println("No"); 
        }
    }
}
