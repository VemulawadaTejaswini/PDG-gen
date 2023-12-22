import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int answer = Math.max(a + b, a - b);
        answer = Math.max(answer, a * b);
        System.out.println(answer);
        sc.close();
    }
}