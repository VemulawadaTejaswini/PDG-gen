import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int[] ns = new int[4];
        for (int i = 0; i < ns.length; i++) {
            int n = std.nextInt();
            ns[i] = n;
        }

        Arrays.sort(ns);
        boolean requiredCondition = ns[0] == 1 && ns[1] == 4 && ns[2] == 7 && ns[3] == 9;
        if (requiredCondition) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}