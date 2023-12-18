import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int v = A % 10;
        if (v == 3) {
            System.out.println("bon");
        } else if (
                v == 0 ||
                v == 1 ||
                v == 6 ||
                v == 8)
            System.out.println("pon");
        else 
            System.out.println("hon");


        return;
    }

}