import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        scanner.close();


        String[] splitStr = S.split("");

        String current = splitStr[0];
        int count = 1;
        for (int i = 1; i < N; i++) {
            if (current.equals(splitStr[i])) {
                continue;
            }
            current = splitStr[i];
            count++;
        }

        System.out.println(count);

    }

}
