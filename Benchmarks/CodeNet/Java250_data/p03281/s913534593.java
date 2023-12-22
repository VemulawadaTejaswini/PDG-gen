public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        System.out.println(n < 105 ? 0 : n < 135 ? 1 : n < 165 ? 2 : n < 189 ? 3 : n < 195 ? 4 : 5);
    }
}