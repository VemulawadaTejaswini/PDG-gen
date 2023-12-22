import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int a = Integer.parseInt(n.substring(0, 2));
        int b = Integer.parseInt(n.substring(2, 4));
        if ((a > 12 || a < 1) && (b > 12 || b < 1)) {
            System.out.println("NA");
        } else if (a > 12 || a < 1) {
            System.out.println("YYMM");
        } else if (b > 12 || b < 1) {
            System.out.println("MMYY");
        } else {
            System.out.println("AMBIGUOUS");
        }
    }

}
