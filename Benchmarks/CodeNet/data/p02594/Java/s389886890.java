import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N >= 30) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
