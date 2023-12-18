import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int['z' - 'a' + 1];
        while (scan.hasNext()) {
            char[] chars = scan.next().toLowerCase().toCharArray();
            for (char ch : chars) {
                if (Character.isLetter(ch)) {
                    num[ch - 'a']++;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%c : %d\n", (char)('a' + i), num[i]);
        }
    }
}