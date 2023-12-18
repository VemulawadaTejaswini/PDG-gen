import java.util.Scanner;

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in).useDelimiter("[,\\s]+");
        int as = 0, bs = 0, abs = 0, os = 0;

        while (scanner.hasNext()) {
            scanner.nextInt();
            String bloodType = scanner.next();
            if (bloodType.equals("A")) {
                as++;
            } else if (bloodType.equals("B")) {
                bs++;
            } else if (bloodType.equals("AB")) {
                abs++;
            } else {
                os++;
            }
        }
        System.out.println(as);
        System.out.println(bs);
        System.out.println(abs);
        System.out.println(os);
    }

    public static void main(String... args) {
        solve();
    }
}