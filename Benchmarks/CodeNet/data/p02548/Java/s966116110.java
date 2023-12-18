import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        long ans = 0;
        for (int c = 1; c < N; c++) {
            int number = N - c;
            int devideNum = 2;
            int count = 0;
            int temp = 0;
            while (number % devideNum == 0) {
                temp++;
                number /= 2;
            }
            count = temp + 1;

            temp = 0;
            devideNum++;
            while (number != 1) {
                if (number % devideNum == 0) {
                    temp++;
                    number /= devideNum;
                } else {
                    devideNum += 2;
                    count *= temp +1;
                    temp = 0;
                }
            }
            count *= temp +1;
            ans += count;
        }

        System.out.println(ans);

    }

}
