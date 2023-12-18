import static java.lang.System.out;

public class QQ {

    public static void main(String[] args) {
        new QQ().recursionQQ();
    }

    public void loopQQ() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                out.println(i + "x" + j + "=" + i * j);
            }
        }
    }

    public void recursionQQ() {
        recursionQQ(1);
    }

    public void recursionQQ(int i) {
        if (i > 9)
            return;
        recursionQ(i, 1);
        recursionQQ(++i);
    }

    public void recursionQ(int i, int j) {
        if (j > 9)
            return;
        out.println(i + "x" + j + "=" + i * j);
        recursionQ(i, ++j);
    }
}