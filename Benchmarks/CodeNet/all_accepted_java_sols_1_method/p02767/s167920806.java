import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 入力データの取得
        Scanner scanner = new Scanner(System.in);
        double member = scanner.nextDouble();
        double[] memberCoordinate = new double[(int) member];
        double sumMemberCoordinate = 0;
        for (int index = 0; index < member; index++) {
            memberCoordinate[index] = scanner.nextDouble();
            sumMemberCoordinate += memberCoordinate[index];
        }
        scanner.close();

        // 処理を行う
        // 最適な座標の算出
        double meetingCoordinate = Math.round(sumMemberCoordinate / member);

        // それぞれの消費体力の算出とその合計値の算出
        double totalEnergy = 0;
        for (int index = 0; index < memberCoordinate.length; index++) {
            totalEnergy += Math.pow(memberCoordinate[index] - meetingCoordinate, 2);
        }

        // 結果の出力
        System.out.println((int) totalEnergy);

    }

}