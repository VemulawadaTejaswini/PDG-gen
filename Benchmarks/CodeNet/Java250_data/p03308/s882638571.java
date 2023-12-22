import java.util.Scanner;

//public class B_Maximum_Difference {
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
//        int[] num = new int[N];
        int min = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (i == 0) {
                min = max = a;
                continue;
            }
            if (a > max) max = a;
            if (a < min) min = a;
        }
        System.out.println(max - min);
    }
}

