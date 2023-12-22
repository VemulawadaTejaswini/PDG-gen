import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        System.out.println(sc.nextInt() + sc.nextInt() + sc.nextInt() >= 22 ? "bust" : "win");
    }
}

