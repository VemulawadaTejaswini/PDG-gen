import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (400 <= N && N < 600)
            System.out.println("8");
        else if (600 <= N && N < 800)
            System.out.println("7");
        else if (800 <= N && N < 1000)
            System.out.println("6");
        else if (1000 <= N && N < 1200)
            System.out.println("5");
        else if (1200 <= N && N < 1400)
            System.out.println("4");
        else if (1400 <= N && N < 1600)
            System.out.println("3");
        else if (1600 <= N && N < 1800)
            System.out.println("2");
        else if (1800 <= N && N < 2000)
            System.out.println("1");
    }

    public static void main(String[] args) {
        new Main();
    }
}
