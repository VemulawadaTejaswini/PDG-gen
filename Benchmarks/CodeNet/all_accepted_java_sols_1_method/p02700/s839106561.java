import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        boolean isWin = false;
        boolean isTakahashiTurn = true;
        while (true) {
            if (isTakahashiTurn) {
                C -= B;
                isTakahashiTurn = false;
            } else {
                A -= D;
                isTakahashiTurn = true;
            }
            if (A <= 0) {
                break;
            } else if (C <= 0) {
                isWin = true;
                break;
            }
        }
        if (isWin) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
