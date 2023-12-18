import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String snake = sc.next();
            if (snake.indexOf('#') > 0 && snake.charAt(0) == '>' && snake.charAt(1) == '\'' && snake.charAt(snake.length() - 1) == '~') {
                String[] l = snake.split("[>'#~]");
                if (l[2].length() == l[3].length() && l[2].length() + l[3].length() + 4 == snake.length()) {
                    System.out.println("A");
                } else {
                    System.out.println("NA");
                }
            } else if (snake.charAt(0) == '>' && snake.charAt(1) == '^' && snake.charAt(snake.length() - 2) == '~' && snake.charAt(snake.length() - 1) == '~' && snake.replaceAll("Q=", "").equals(">^~~")) {
                System.out.println("B");
            } else {
                System.out.println("NA");
            }
        }
    }
}

