import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int paperNum = 0;

        paperNum += N / 2;

        if (N % 2 == 1) {
            paperNum++;
        }

        System.out.println(paperNum);
    }
}