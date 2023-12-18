import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        if(x < a) {
        	System.out.println(0);
        } else {
        	System.out.println(10);
        }
    }
}