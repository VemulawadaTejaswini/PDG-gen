

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String line = in.nextLine();
        int digitsSum = 0;
        for (char c : line.toCharArray()) {
            digitsSum = (digitsSum + c - '0') % 9;
        }
        System.out.println(digitsSum % 9 == 0 ? "Yes" : "No");
    }
}
