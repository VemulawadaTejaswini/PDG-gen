import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, i = 1;
        while( (a = scanner.nextInt()) != 0){
            System.out.println("Case " + i + ": " + a);
            i++;
        }
        scanner.close();
    }
}
