import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if ((n + 1) / 2 < k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}




