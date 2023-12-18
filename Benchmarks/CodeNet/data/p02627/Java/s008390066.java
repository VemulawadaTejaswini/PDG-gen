

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        char c = in.nextLine().charAt(0);
        if (Character.isUpperCase(c)) {
            System.out.println('A');
        } else {
            System.out.println('a');
        }
    }
}
