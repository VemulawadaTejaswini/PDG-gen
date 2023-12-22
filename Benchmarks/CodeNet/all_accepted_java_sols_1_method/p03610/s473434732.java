
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String S = Input.next();
        for (int I = 0; I < S.length(); I += 2) {
            System.out.print(S.charAt(I) + "");
        }

    }
}
