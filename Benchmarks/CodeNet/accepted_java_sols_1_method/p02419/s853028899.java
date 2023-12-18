import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String comparison = scan.next();
        String word;
        int count = 0;
        while ("END_OF_TEXT".equals((word = scan.next())) == false) {
            if (word.equalsIgnoreCase(comparison))
                count++;
        }
        System.out.println(count);
    }
}