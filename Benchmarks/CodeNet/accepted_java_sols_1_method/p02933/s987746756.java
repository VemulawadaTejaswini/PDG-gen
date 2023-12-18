import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static int mod = (int) 10e8 + 7;

    public static void main(String[] args) {
        int a = sc.nextInt();
        String s = sc.next();
        if (a < 3200) {
            System.out.println("red");
        } else {
            System.out.println(s);
        }
    }

}
