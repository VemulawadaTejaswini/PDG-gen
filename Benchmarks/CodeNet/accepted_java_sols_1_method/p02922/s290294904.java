import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputStr = scanner.nextLine().split(" ");
        int a = Integer.valueOf(inputStr[0]);
        int b = Integer.valueOf(inputStr[1]);
        int ans = 0;
        int totalTapCnt = 1;

        while(totalTapCnt < b) {
            totalTapCnt += (a - 1);
            ans++;
        }

        System.out.println(ans);
    }
}