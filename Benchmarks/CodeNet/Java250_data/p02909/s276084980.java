

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // sunny cloudy rainy
        Scanner scanner = new Scanner(System.in);
        String current = scanner.nextLine();
        scanner.close();

        String ans = current.equals("Sunny") ? "Cloudy" : current.equals("Cloudy") ? "Rainy" : "Sunny";
        System.out.println(ans);
    }
}