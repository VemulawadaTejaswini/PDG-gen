import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputData;

        Scanner scanner = new Scanner(System.in);
        inputData = scanner.nextLine();
        scanner.close();
        char inputCharactor = inputData.charAt(0);

        inputCharactor++;

        System.out.println(inputCharactor);

    }
}