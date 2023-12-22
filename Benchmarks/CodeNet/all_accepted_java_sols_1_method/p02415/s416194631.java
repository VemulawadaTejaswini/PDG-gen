import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String input = stdIn.nextLine();

        for(char c : input.toCharArray()) {
            if('A' <= c && c <= 'Z') {
                System.out.print((char)(c + 'a' - 'A'));
            } else if('a' <= c && c <= 'z') {
                System.out.print((char)(c + 'A' - 'a'));
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}