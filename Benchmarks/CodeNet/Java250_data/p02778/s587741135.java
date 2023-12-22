import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // 入力データの取得
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        // 文字列の編集
        int inputDataNumber = inputData.length();
        char[] displayStringLength = new char[inputDataNumber];
        for (int index = 0; index < displayStringLength.length; index++) {
            displayStringLength[index] = 'x';
        }

        // 編集した文字列の出力
        String displayData = new String(displayStringLength);
        System.out.println(displayData);

    }

}