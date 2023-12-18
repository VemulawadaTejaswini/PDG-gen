import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        N %= 10;
        if(N == 2 || N == 4 || N == 5|| N == 7 || N ==9) {
            System.out.println("hon");
        }else if(N == 3) {
            System.out.println("bon");
        }else {
            System.out.println("pon");
        }


    }
}