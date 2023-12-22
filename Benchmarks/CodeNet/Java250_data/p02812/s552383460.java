import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String inputString = scanner.next();
        int counter = 0;
        int index = 0;
        while (index != -1) {
            index = inputString.indexOf("ABC", index);
            if (index != -1) {
                counter++;
                index++;
            }
        }
        System.out.println(counter);
    }
}
