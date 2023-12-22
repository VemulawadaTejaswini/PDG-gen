public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] count = new int[26];
        scanner.next().chars().forEach(c -> count[c - 'A']++);
        System.out.println(count['R' - 'A'] > count['B' - 'A'] ? "Yes" : "No");
    }
}