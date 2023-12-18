
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int a = scanner.nextInt();
        while( a > 0 ){
            System.out.println("Case "+count+": "+a);
            a = scanner.nextInt();
            count++;
        }
    }
}

