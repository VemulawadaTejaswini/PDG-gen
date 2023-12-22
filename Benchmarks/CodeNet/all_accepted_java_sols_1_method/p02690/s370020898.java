import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        Boolean flag = false;
        for (int i = -118; i < 120; i++) {
            for (int j = -119; j < 119; j++) {
                if (Math.pow(i, 5) - Math.pow(j, 5) == X) {
                    System.out.println(i + " " + j);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}