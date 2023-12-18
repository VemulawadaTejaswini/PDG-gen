import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[3];
        for (int i = 0; i < 3; ++i) num[i] = sc.nextInt();
        sc.close();
        Arrays.sort(num);
        System.out.print(num[0] + num[1] + num[2] * 10);
    }
}