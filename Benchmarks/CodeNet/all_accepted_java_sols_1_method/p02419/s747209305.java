import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.next();
        int n = 0;
        while(true) {
            String l = scanner.next();
            if (l.equals("END_OF_TEXT")) break;
            if (l.toLowerCase().equals(w)) n++;
        }
        System.out.println(n);

        scanner.close();
    }
}

