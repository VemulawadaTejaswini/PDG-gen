import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sNumbers = sc.next().split("");

        int nearest = 1000;
        for (int i = 0; i <= sNumbers.length - 3; i++) {
            String sNumber = "";
            sNumber += sNumbers[i];
            sNumber += sNumbers[i + 1];
            sNumber += sNumbers[i + 2];

            int number = Integer.parseInt(sNumber);
            nearest = Math.min(Math.abs(753 - number), Math.abs(nearest));
        }
        System.out.println(nearest);
    }
}