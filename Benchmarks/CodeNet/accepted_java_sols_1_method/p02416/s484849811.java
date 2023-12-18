import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            char a[] = sc.nextLine().toCharArray();
            int b[] = new int[1000];
            int sum = 0;
            if (a[0] == '0') {
                break;
            }
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i] - '0';
                sum += b[i];
            }
            System.out.printf("%d\n", sum);
        }
        sc.close();
    }
}
