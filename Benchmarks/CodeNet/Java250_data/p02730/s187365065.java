import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inString = scanner.next();
        scanner.close();

        char[] subSt1 = inString.substring(0, (inString.length() - 1) / 2).toCharArray();
        char[] subSt2 = inString.substring((inString.length() + 3) / 2 - 1, inString.length()).toCharArray();
        char[] inst = inString.toCharArray();
        boolean ans = true;
        inString = null;

        for (int i = 0; i < inst.length; i++) {
            if (inst[i] != inst[inst.length - 1 - i]) {
                ans = false;
                break;
            }
        }

        for (int i = 0; i < subSt1.length; i++) {
            if (subSt1[i] != subSt1[subSt1.length - 1 - i]) {
                ans = false;
                break;
            }
        }

        for (int i = 0; i < subSt2.length; i++) {
            if (subSt2[i] != subSt2[subSt2.length - 1 - i]) {
                ans = false;
                break;
            }
        }

        System.out.println(ans ? "Yes" : "No");

    }
}