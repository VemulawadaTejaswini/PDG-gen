import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(toRelationship(a, b));
    }

    public static String toRelationship(int a, int b) {
        if (a == b) return "a == b";
        if (a > b) return "a > b";
        if (a < b) return "a < b";
        return "";
    }
}