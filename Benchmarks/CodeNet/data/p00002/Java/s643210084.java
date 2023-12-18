import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println((int) Math.log10(sc.nextInt() + sc.nextInt()) + 1);
        }
    }
}
