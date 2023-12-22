import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int area = 2 * D + 1;
        if (area > N) {
            System.out.println("1");
        } else if (N % area == 0){
            System.out.println(N / area);
        } else {
            System.out.println(N / area + 1);
        }
    }
}