import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int T = Integer.parseInt(sc.next());
        int num = (T / A) * B;
        System.out.print(num);
    }
}