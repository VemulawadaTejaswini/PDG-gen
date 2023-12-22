import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) {
                if (input[i] == 'R' || input[i] == 'U' || input[i] == 'D') {

                } else {
                    System.out.println("No");
                    return;
                }
            } else {
                if (input[i] == 'L' || input[i] == 'U' || input[i] == 'D') {

                } else {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}