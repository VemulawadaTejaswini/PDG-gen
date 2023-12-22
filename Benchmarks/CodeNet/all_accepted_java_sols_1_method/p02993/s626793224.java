import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String[] pass = s.split("");
        boolean isGood = true;
        for (int i = 0; i < pass.length - 1 && isGood; i++) {
            if (pass[i].equals(pass[i + 1])) {
                isGood = false;
            }
        }

        System.out.println(isGood ? "Good" : "Bad");
    }
}
