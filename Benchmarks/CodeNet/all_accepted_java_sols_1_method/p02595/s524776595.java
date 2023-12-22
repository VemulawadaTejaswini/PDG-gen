import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;

        for (int i = 0; i<n ; i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            double area = Math.sqrt( (x*x) + (y*y) );
            if (area<=d)
                ans++;
        }

        System.out.println(ans);
    }
}