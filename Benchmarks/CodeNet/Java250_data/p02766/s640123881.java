import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 入力されたデータの準備
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        String[] editedInputData = inputData.split(" ");
        long checkNum = Long.parseLong(editedInputData[0]);
        double baseNum = Integer.parseInt(editedInputData[1]);
        scanner.close();

        // 判定
        double exponentCount = 1;
    
        while (true) {
            double exponentNum = Math.pow(baseNum, exponentCount);
            if (checkNum < exponentNum) {
                break;
            }
            exponentCount++;
        }

        long count = (long)exponentCount;

        System.out.println(count);

    }

}