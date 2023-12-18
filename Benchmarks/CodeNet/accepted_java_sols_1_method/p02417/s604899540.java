import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(System.in);
        int[] counter = new int[26];
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int[] array = new int[str.length()];
            // System.out.println("str.length = " + str.length());
            for (int i = 0; i < str.length(); i++) {
                    array[i] = str.charAt(i) - 'a';
                    // System.out.println("array[" + i + "] = " + array[i]);
            }
            for (int j = 0; j < array.length; j++) {
                int value = array[j];
                // System.out.println("value = " + value);
                if ((value >= 0) && (value <= 25)) {
                    counter[value]++;
                    // System.out.println("counter[" + value + "] = " + counter[value]);
                } else if ((value >= -32) && (value <= -7)) {
                    counter[value + 32]++;
                    // System.out.println("counter[" + (value + 32) + "] = " + counter[value + 32]);
                }
            }
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // System.out.println("ch - 'a' = " + (ch - 'a'));
            System.out.println(ch + " : " + counter[ch - 'a']);
        }
    }
}
