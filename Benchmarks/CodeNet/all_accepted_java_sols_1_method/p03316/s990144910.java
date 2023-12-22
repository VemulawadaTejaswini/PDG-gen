import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n;
        try (Scanner cin = new Scanner(System.in)) {
            n = cin.nextInt();
        }
        int sn = Integer.toString(n).chars().map(x -> x - '0').sum();

        System.out.println(n % sn == 0 ? "Yes" : "No");
    }
}