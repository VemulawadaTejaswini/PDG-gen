import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputNameA;
        String inputNameB;
        int numberOfA;
        int numberOfB;
        String choiceName;

        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        String inputNum = scanner.nextLine();
        choiceName = scanner.nextLine();
        scanner.close();

        String[] editInputName = inputName.split(" ");
        inputNameA = editInputName[0];
        inputNameB = editInputName[1];
        String[] editInputNum = inputNum.split(" ");
        numberOfA = Integer.parseInt(editInputNum[0]);
        numberOfB = Integer.parseInt(editInputNum[1]);

        if (inputNameA.equals(choiceName)) {
            numberOfA--;
        } else if (inputNameB.equals(choiceName)) {
            numberOfB--;
        }

        System.out.println(numberOfA + " " + numberOfB);

    }
}