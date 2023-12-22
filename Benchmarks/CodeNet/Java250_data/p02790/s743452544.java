import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);

        String aA = "";
        String bB = "";

        for (int i = 0; i < a; i++) {
            aA += bStr;
        }

        for (int i = 0; i < b; i++) {
            bB += aStr;
        }

        if (aA.compareTo(bB) < 0) {
            System.out.println(aA);
        } else {
            System.out.println(bB);
        }

    }
}
