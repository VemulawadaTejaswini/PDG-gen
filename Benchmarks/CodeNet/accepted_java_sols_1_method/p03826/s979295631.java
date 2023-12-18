
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int A = Input.nextInt();
        int B = Input.nextInt();
        int C = Input.nextInt();
        int D = Input.nextInt();

        long CCC = A * B;
        long QQQ = C * D;
        if (QQQ >= CCC) {
            System.out.println(QQQ);
        } else {
            System.out.println(CCC);
        }

    }
}
