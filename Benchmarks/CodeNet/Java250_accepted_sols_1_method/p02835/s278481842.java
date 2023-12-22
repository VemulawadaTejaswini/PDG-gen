import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int drowNum1;
        int drowNum2;
        int drowNum3;

        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        String[] editedInputData = inputData.split(" ");
        drowNum1 = Integer.parseInt(editedInputData[0]);
        drowNum2 = Integer.parseInt(editedInputData[1]);
        drowNum3 = Integer.parseInt(editedInputData[2]);

        int sumNum = drowNum1 + drowNum2 + drowNum3;

        if (sumNum >= 22) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }

    }
}