import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        long count = 0;

        if ((A >= 1 && A <= 9) && (B >= 1 && B <= 9)) {
            count = A * B;
        }else{
            count = -1;
        }

        System.out.println(count);

    }

}

