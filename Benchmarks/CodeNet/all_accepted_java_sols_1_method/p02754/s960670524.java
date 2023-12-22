import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        long checkNum;
        long blueBall;
        long redBall;

        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        String[] editedInputData = inputData.split(" ");
        checkNum = Long.parseLong(editedInputData[0]);
        blueBall = Long.parseLong(editedInputData[1]);
        redBall = Long.parseLong(editedInputData[2]);

        long blueAndRed = blueBall + redBall;
        long countBall = checkNum % blueAndRed;
        long blueAndRedBallSet = checkNum / blueAndRed;
        
        long totalBlueBall = blueAndRedBallSet * blueBall;

        if (countBall <= blueBall) {
            totalBlueBall += countBall;
        } else {
            totalBlueBall += blueBall;
        }

        System.out.println(totalBlueBall);

    }
}