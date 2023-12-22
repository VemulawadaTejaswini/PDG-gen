import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "";

        while (sc.hasNextLine()) {
            str += sc.nextLine();
        }

        char x;
        char[] alpha = new char[26];
        int[] count = new int[26];

        int k = 0;
        for (x = 'a'; x <= 'z'; x++) {
            alpha[k] = x;
            k++;
        }

        char[] strArray = (str.toLowerCase()).toCharArray();

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                if (strArray[i] == alpha[j]) {
                    count[j] += 1;
                }
            }
        }

        for (int i = 0; i < alpha.length; i++) {
            System.out.println(alpha[i] + " : " + count[i]);
        }

        sc.close();
    }
}
