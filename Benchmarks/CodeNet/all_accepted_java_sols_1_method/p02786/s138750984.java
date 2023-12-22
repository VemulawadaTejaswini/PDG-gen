import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 入力データの取得
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        scanner.close();

        // 入力データの加工
        long editedInputData = Long.parseLong(inputData);

        // 攻撃の処理
        // モンスターの体力が1のときとそれ以外で分岐する
        long totalAttack = 0;
        if (editedInputData == 1) {
            totalAttack = 1;
        } else {
            double count = 0;
            while (true) {
                count++;
                editedInputData /= 2;
                if (editedInputData == 1) {
                    break;
                }
            }
            for (int index = 0; index <= count; index++) {
                totalAttack += (long) (Math.pow(2, index));
            }
        }

        // 判定結果を出力する
        System.out.println(totalAttack);

    }

}