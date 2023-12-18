import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int count = 0;
        if (str.charAt(0) == '1') count++;
        if (str.charAt(1) == '1') count++;
        if (str.charAt(2) == '1') count++;

        System.out.println(count);
    }
}