import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            check(sc.nextLine());
        }
    }

    private static void check(String s) {
        for (int i = 0; i <= 9; i++) {
            String[] lines = s.replaceAll("X", String.valueOf(i)).split("[+=]");
            if (new BigInteger(lines[0]).add(new BigInteger(lines[1])).equals(new BigInteger(lines[2]))) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("NA");
    }
}

