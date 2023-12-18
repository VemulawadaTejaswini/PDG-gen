public class Main {

    public static void main(String[] args) {
        double totalDebt; // 借金合計

        for (int i = 0; i < args.length; i++) {
            int intInputWeek = Integer.parseInt(args[i]);

            // 借金計算
            totalDebt = calcDebt(100000, intInputWeek);
            System.out.println((int) totalDebt);
        }
    }

    /**
     * 借金計算メソッド（週利0.05%）
     * @param debt 現在の借金
     * @param week 現在の残り週
     * @return 借金額
     */
    private static double calcDebt(double debt, int week) {
        if (week == 0) {
            return debt;
        }
        debt *= 1.05;

        // 1000円未満は切り上げる
        double debtPlus = debt / 1000 - (int) (debt / 1000);
        if (debtPlus > 0)
            debt = debt + 1000 - debtPlus * 1000;

        return calcDebt(debt, --week);
    }

}