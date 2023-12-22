import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       int r = sc.nextInt();
       int D = sc.nextInt();
       int x = sc.nextInt();
       int ans = x*r-D;
       System.out.println(ans);
       for (int i = 0; i < 9; i++) {
           System.out.println(ans*r-D);
           ans = ans*r-D;
       }
    }

}
