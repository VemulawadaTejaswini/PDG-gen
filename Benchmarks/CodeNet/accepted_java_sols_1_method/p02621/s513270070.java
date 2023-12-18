import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int answer = 0;

        scanner.close();
        answer = a + a * a + a * a * a;
        
        System.out.println(answer);
    }
}
