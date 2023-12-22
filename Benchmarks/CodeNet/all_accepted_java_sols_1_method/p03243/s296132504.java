import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int THRESHOLD = 111;

        for(int i = 0; i < 9; i++) {
            if(N > THRESHOLD * i && N <= THRESHOLD * (i + 1)) {
                System.out.println(THRESHOLD * (i + 1));
                break;
            }
        }
    }
}