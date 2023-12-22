import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int T = (int) Math.ceil(c / (b * 1.0));
        int A = (int) Math.ceil(a / (d * 1.0));
        if (T <= A) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
