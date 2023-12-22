import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder("");

        while(sc.hasNextInt()) {
            if (!result.toString().equals("")) {
                result.append("\n");
            }

            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            result.append(String.valueOf(sum).length());
        }

        System.out.println(result.toString());
    }
}