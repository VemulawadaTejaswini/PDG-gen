import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = scan.next();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int wantGet = (alpha.indexOf(c) + num) % 26;
            String[] alphaList = alpha.split("");
            result += alphaList[wantGet];
        }

        System.out.println(result);
    }
}