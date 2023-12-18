import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int input = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            input = scan.nextInt();
            sum += input;
            list.add(input);
        }
        Collections.sort(list);
        System.out.println(list.get(0) + " " + list.get(n-1) + " " + sum);
    }
}