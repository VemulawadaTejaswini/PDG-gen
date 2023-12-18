import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 3 <= n <= 10,000
        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();
        int num = 0;
        for (int i = 3; i <= n; i++) {
            num = i;

            // ３で割り切れる数を格納
            if (num%3 == 0) {
                output.append(" " + i);
                num = 0;
            }

            // 3で割り切れない、3が含まれる数を格納
            while(num > 0) {
                if (num%10 == 3) {
                    output.append(" " + i);
                    break;
                }
                else num /= 10;
            }

        }

        System.out.println(output);

        sc.close();
    }
}
