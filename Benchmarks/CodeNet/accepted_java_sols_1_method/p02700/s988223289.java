import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer A = input.nextInt();
        Integer B = input.nextInt();
        Integer C = input.nextInt();
        Integer D = input.nextInt();

        Integer ConfirmTimeT = (int)Math.ceil((float)C / B);
        Integer ConfirmTimeA = (int)Math.ceil((float)A / D);

        if (ConfirmTimeT <= ConfirmTimeA) System.out.println("Yes");
        else System.out.println("No");
    }
}
