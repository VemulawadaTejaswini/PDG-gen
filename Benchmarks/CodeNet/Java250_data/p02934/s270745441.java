import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        main2(sc);
    }

    public static void main2(Scanner sc) {

        int N = sc.nextInt();
        double sum = 0;

        for (int i = 0; i < N; i++) {
        	double x = sc.nextDouble();
        	sum += 1/x;
        }

        System.out.println(1/sum);
    }
}