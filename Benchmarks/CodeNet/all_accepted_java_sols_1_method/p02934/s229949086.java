import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int t = scan.nextInt();
        double sum = 0;
        for (int i = 0; i < t; i++) {
            sum += (double) 1/scan.nextDouble();
        }

        System.out.println(1/sum);
    }
}
