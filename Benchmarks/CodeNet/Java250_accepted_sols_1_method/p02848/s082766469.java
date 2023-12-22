import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int shift = Integer.parseInt(in.readLine());
        String string = in.readLine();
        for (int i = 0; i < string.length(); i++) {
            int val = string.charAt(i)-'A';
            val += shift;
            val %= 26;

            System.out.print(((char)(val + 'A')));
        }
        System.out.print('\n');
    }

}
/*


 */