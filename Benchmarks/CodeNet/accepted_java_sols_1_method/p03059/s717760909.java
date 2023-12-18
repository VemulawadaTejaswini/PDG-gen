import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        float T = Float.parseFloat(sc.next()) + 0.5F;

        int total = 0;
        int time = 0;
        while (true) {
            time += A;
            if (time > T) {
                break;
            } else {
                total += B;
            }
        }

        System.out.println(total);
        sc.close();
    }
}