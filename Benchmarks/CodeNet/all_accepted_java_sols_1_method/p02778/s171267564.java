import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            answer += "x";
        }
      System.out.println(answer);
    }
}