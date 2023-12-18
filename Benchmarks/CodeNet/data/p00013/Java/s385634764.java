import java.lang.Exception;
import java.lang.Integer;
import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\\D");

        int n;
        int i = 0;
        List<Integer> queue = new ArrayList<Integer>();
        while (true) {
            try {
                n = sc.nextInt();
            } catch (Exception ex) {
                break;
            }

            if (n > 0) {
                queue.add(n);
                i++;
            } else {
                System.out.println(queue.get(i - 1));
                queue.remove(i - 1);
                i--;
            }
        }
    }
}