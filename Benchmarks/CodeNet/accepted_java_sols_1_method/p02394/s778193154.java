import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author saku
 */
public class Main {

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        
        if (r <= x && x <= w-r && r <= y && y <= h-r) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}