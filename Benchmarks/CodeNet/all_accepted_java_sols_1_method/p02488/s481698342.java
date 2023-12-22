import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] w = new String[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.next();
        }

        String min = w[0];
        for (int i = 1; i < n; i++) {
            if (w[i].compareTo(min) < 0) {
                min = w[i];
            }
        }

        System.out.println(min);
    }
}