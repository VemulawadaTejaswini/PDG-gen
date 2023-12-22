import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sheep = scanner.nextInt();
        int wolves = scanner.nextInt();

        if(sheep <= wolves) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }

    }
}