/**
 * Write a program which prints multiplication tables in the following format:
 * @author midorinochawan
 */
class Main {

    private final int MaxNumber = 9;
    private static Main instance = new Main();

    private Main() {

    }

    public static Main getInstance() {
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main.getInstance().Run();
    }
}