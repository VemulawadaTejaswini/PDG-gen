import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int odd = (N + 1) / 2;
        double prob = (double) odd / N;
        System.out.println(prob);
    }
}