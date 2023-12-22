import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        int count = 0;
        for(int i = 0; i <= c; i++) {
            if(i % a == 0 && i != 0) count += b;
        }
        System.out.println(count);

    }
}