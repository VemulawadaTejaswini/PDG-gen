import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");

        if (str[1].equals("+")) {
            System.out.println(Integer.valueOf(str[0]) + Integer.valueOf(str[2]));
        } else if (str[1].equals("-")) {
            System.out.println(Integer.valueOf(str[0]) - Integer.valueOf(str[2]));
        }
    }
}