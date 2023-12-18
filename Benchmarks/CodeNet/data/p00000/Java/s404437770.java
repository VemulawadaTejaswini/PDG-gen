public class QQ {

    private final int MaxNumber = 9;
    private static QQ instance = new QQ();

    private QQ() {

    }

    public static QQ getInstance() {
        return instance;
    }
    public boolean Run() {
        for (int i = 1; i <= MaxNumber; ++i) {
            for (int j = 1; j <= MaxNumber; ++j) {
                if (MaxNumber < i || MaxNumber < j) {
                    return false;
                }
                printQQ(i, j);
            }
        }

        return true;
    }

    private void printQQ(int left, int right) {
        System.out.println(String.format("%dx%d=%d", left, right, left * right));
    }

    public static void main(String[] args) {
        QQ.getInstance().Run();
    }
}