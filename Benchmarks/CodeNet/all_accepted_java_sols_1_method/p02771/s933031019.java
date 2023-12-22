import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int inputANum;
        int inputBNum;
        int inputCNum;

        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        String[] editInputData = inputData.split(" ");

        inputANum = Integer.parseInt(editInputData[0]);
        inputBNum = Integer.parseInt(editInputData[1]);
        inputCNum = Integer.parseInt(editInputData[2]);

        if ((inputANum == inputBNum && inputBNum == inputCNum) || (inputANum != inputBNum && inputBNum != inputCNum && inputANum != inputCNum)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }
}