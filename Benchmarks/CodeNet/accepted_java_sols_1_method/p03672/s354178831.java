import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int symStrLen = -1;
        boolean isSymmetry = false;
        for(int i = 1;i < s.length();i++) {
            if((s.length() - i) % 2 == 1) continue;
            String leftStr = s.substring(0, (s.length() - i) / 2);
            String rightStr = s.substring((s.length() - i) / 2, s.length() - i);

            isSymmetry = leftStr.equals(rightStr);
            if(isSymmetry) {
                symStrLen = leftStr.length() + rightStr.length();
                break;
            }
        }

        System.out.println(symStrLen);
    }
}
