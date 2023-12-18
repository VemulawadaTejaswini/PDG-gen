
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String S = Input.next();
        S = S.toLowerCase();
        int X = 0;
        for (int I = 97; I <= 97 + 25; I++) {
            char A = (char) I;
            if (S.contains(A + "")) {
                X++;
            } else {
                System.out.print(A);
                break;
            }
        }
        if (X >= 26) {
            System.out.println("None");
        }

    }
}
