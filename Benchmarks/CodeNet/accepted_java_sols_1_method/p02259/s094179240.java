import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        int x[];
        x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = num.nextInt();
        }
        int count = 0;


        int flag = 1;
        while (flag == 1) {
            flag = 0;
            for (int j = n - 1; j >= 1; j--) {
                if (x[j] < x[j - 1]) {
                    int tmp = x[j];
                    x[j] = x[j - 1];
                    x[j - 1] = tmp;
                    flag = 1;
                    count++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d", x[i]);
            if (i != n - 1) System.out.printf(" ");
            else System.out.printf("\n");
        }

        System.out.println(count);
    }
}
