import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputA;
        String inputB;

        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        String[] editedInputData = inputData.split(" ");
        inputA = editedInputData[0];
        inputB = editedInputData[1];

        System.out.println(inputB + inputA);

    }
}