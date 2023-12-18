import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        str.append(scan.next());
        int amount = scan.nextInt();
        String op;
        for (int i = 0; i < amount; i++) {
            op = scan.next();
            if ("replace".equals(op)) {
                int start = scan.nextInt();
                int end = scan.nextInt();
                String substr = scan.next();
                str.replace(start, end + 1, substr);
            }
            if ("reverse".equals(op)) {
                int start = scan.nextInt();
                int end = scan.nextInt();
                StringBuilder for_reverse = new StringBuilder();
                for_reverse.append(str.substring(start, end + 1));
                for_reverse.reverse();
                str.replace(start, end + 1, for_reverse.toString());
            }
            if ("print".equals(op)) {
                int start = scan.nextInt();
                int end = scan.nextInt();
                System.out.println(str.substring(start, end + 1));
            }
        }
    }
}