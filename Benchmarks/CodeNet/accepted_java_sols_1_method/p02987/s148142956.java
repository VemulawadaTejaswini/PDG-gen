import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String string = in.readLine();
        ArrayList<Character> chars = new ArrayList<>();
        int amount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (!chars.contains(string.charAt(i))) {
                chars.add(string.charAt(i));
                amount++;
            }
        }
        if (amount == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
/*


 */