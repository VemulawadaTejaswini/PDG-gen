public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int t;
        System.out.println(scanner.nextInt() == (t = scanner.nextInt()) && t == scanner.nextInt() ? "Yes" : "No");
    }
}