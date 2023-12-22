import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 入力データの取得
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        //データの加工
        String[] editedInputData = inputData.split(" ");
        int smallerTax = Integer.parseInt(editedInputData[0]);
        int biggerTax = Integer.parseInt(editedInputData[1]);

        // 税抜き価格の算出
        double taxA = 0.08;
        double taxB = 0.10;
        int[][] taxAAndB = new int[1000][2];
        for (int index = 0; index < taxAAndB.length; index++) {
            taxAAndB[index][0] = (int) Math.floor((index + 1) * taxA);
            taxAAndB[index][1] = (int) Math.floor((index + 1) * taxB);
        }

        // 判定
        for (int index = 0; index < taxAAndB.length; index++) {
            if (taxAAndB[index][0] == smallerTax && taxAAndB[index][1] == biggerTax) {
                System.out.println(index + 1);
                return;
            }
        }

        System.out.println("-1");
        
    }

}