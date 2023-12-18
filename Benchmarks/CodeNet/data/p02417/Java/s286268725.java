import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] alpha = new int['z' - 'a' + 1];
        while (scan.hasNext()) {
            String str = scan.next().toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    alpha[str.charAt(i) - 'a']++;
                }
            }
        }
        for (int i = 0; i < alpha.length; ++i) {
            System.out.println((char)('a' + i) + " : " + alpha[i]);
        }
    }
}