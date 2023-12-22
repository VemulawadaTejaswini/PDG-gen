import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int length = input.length();
        int latter = (length + 3) / 2 ;
        int i = 0;
        for (i = 0; i < length / 2;i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                break;
 
            }
            if (i < (length) / 2) {
                if (input.charAt(i) != input.charAt((length) / 2 - 1 -  i)) {
 
                    break;
                }
            }
            if (i < (length - latter) / 2) {
                if (input.charAt(length - i - 1) != input.charAt(latter + i - 1)) {
                    break;
                }
            }
        }
        if (i == length / 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}